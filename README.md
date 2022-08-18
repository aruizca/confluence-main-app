# confluence-main-app

---------------------

## Overview
This very simple Confluence app was created to investigate how to package an app (this one) along with another dependency app ([sample-app](https://github.com/aruizca/confluence-sample-app)) 
inside an OBR file, from which they are both installed in Confluence.

### Technical Requirements

* Java 11 (adoptium openjdk)
* Maven 3.6.3+
* Confluence 7.4+

## Packaging Steps
Assuming you have a Confluence 7.4+ instance up and running:

1. Clone this repo and the [sample-app](https://github.com/aruizca/confluence-sample-app) repo so that both sit in the same parent folder. Eg:
```shell
workspace/
├── confluence-main-app
├── confluence-sample-app
```

2. Package the sample-app
```shell
# From confluence-sample-app directory
mvn clean package
```

3. Package the main-app
```shell
# From confluence-main-app directory
mvn clean package
```
This will generate the OBR file on: `/target/main-app-1.0.0-SNAPSHOT.obr`

4. Upload OBR file to your Confluence instance

### Current problem!!!

Only the main app is installed but the sample app is not.

## OBR tutorials and other guides used

* [Tutorial: how to create an obr with dependent jar inside](https://community.atlassian.com/t5/Jira-articles/Tutorial-how-to-create-an-obr-with-dependent-jar-inside/ba-p/708656)
* [Bundling extra dependencies in an OBR](https://developer.atlassian.com/server/framework/atlassian-sdk/bundling-extra-dependencies-in-an-obr/)
* [AMPS build configuration reference](https://developer.atlassian.com/server/framework/atlassian-sdk/amps-build-configuration-reference/)