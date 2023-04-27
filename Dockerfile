FROM alpine:3.17

MAINTAINER Guillermo

COPY target/portfolioBackend-0.0.1-SNAPSHOT.jar portfolioBackend-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","/portfolioBackend-0.0.1-SNAPSHOT.jar"]