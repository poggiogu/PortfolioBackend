FROM openjdk:17-jdk-slim

MAINTAINER Guillermo

COPY target/portfolioBackend-0.0.1-SNAPSHOT.jar portfolioBackend-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","/portfolioBackend-0.0.1-SNAPSHOT.jar"]