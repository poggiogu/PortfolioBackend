FROM adoptopenjdk:17-jdk-hotspot 

MAINTAINER guillermo

COPY target/portfolioBackend-0.0.1-SNAPSHOT.jar portfolioBackend-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","/portfolioBackend-0.0.1-SNAPSHOT.jar"]