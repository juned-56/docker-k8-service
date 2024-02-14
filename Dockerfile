FROM openjdk:17.0.2
VOLUME /tmp
EXPOSE 7777
ARG JAR_FILE=target/spring-boot-docker.jar
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]