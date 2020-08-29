dir = new File(new File(request.outputDirectory), request.artifactId)

def runCommand(String cmd) {
    System.out.printf("Running command [%s]%n", cmd);
    def process = cmd.execute(null, dir)
    process.waitForProcessOutput((Appendable)System.out, System.err)
    if (process.exitValue() != 0) {
        throw new RuntimeException("'$cmd' failed with exit code: ${process.exitValue()}")
    }
}


runCommand("mv java.gitignore .gitignore")
runCommand("mvn -N io.takari:maven:wrapper")
runCommand("git init")
runCommand("git add .")
runCommand("git commit -m \"initial-commit\"")
