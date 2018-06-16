FROM openjdk:8-jre-alpine

MAINTAINER Manu Garcia <manugarciarodriguez@gmail.com>

VOLUME /tmp

EXPOSE 8080

ADD target/user-service-0.0.1-SNAPSHOT.jar app.jar

RUN sh -c 'touch /app.jar'

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
