FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD compose-demo-0.0.1-SNAPSHOT.jar compose-demo-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/compose-demo-0.0.1-SNAPSHOT.jar"]