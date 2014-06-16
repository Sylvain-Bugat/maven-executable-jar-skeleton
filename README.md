maven-executable-jar-skeleton
=============================

Skeleton project of a simple self-executable jar

## Customize the executable jar

Edit the pom.xml file to add dependencies and customize the build and the application name.  
Add sources and resources into sur `src/main/java` directory.

## Build the executable jar

To build the executable jar file with all dependencies: `mvn clean install`

## Launch the executable jar

Just execute this jar file: `target/maven-executable-jar-skeleton-1.0-SNAPSHOT-jar-with-dependencies.jar`.  
An information diablog box must be displayed like this screenshot:  
![executable jar screenshot](screenshot.png)

