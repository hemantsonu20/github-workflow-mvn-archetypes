![Java CI with Maven](https://github.com/hemantsonu20/github-workflow-mvn-archetypes/workflows/Java%20CI%20with%20Maven/badge.svg)

# github-workflow-mvn-archetypes
Maven Archetypes for java based projects with configured github workflow.

* [github-workflow-java-archetype](#github-workflow-java-archetype) 

## github-workflow-java-archetype
[![Maven Central](https://img.shields.io/maven-central/v/com.github.hemantsonu20/github-workflow-java-archetype.svg?label=Maven%20Central&color=brightgreen)](https://search.maven.org/search?q=g:%22com.github.hemantsonu20%22%20AND%20a:%22github-workflow-java-archetype%22)

**Description:**  
A maven archetype which generates a java / maven project. It has configured github workflow for building your maven project.  

- Whenever a code is pushed to `master` or a pull request is opened on `master` branch, an automatic build via
[github actions](https://docs.github.com/en/actions) will be triggered automatically.
- A nice workflow badge with build status will be visible in your README.md.

**How to use:**  
Open a terminal, goto folder where you want to generate the project and run below command.
```
mvn archetype:generate -DarchetypeGroupId=com.github.hemantsonu20 -DarchetypeArtifactId=github-workflow-java-archetype -DarchetypeVersion=1.0.1
```
When asked provide `groupId`, `artifactId`, `package`, `GithubOrgOrAccount` (your github org name or username).  
You can also provide these options on command line directly as:
```
mvn archetype:generate -DarchetypeGroupId=com.github.hemantsonu20 \
                       -DarchetypeArtifactId=github-workflow-java-archetype \
                       -DarchetypeVersion=1.0.1 \
                       -DgroupId=com.example \
                       -DartifactId=demo \
                       -DGithubOrgOrAccount=YourGithubOrgOrAccount
```

# License
[Apache-2.0 License](/LICENSE)
