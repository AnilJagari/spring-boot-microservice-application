FROM eclipse-temurin:17-jdk-alpine
ARG JAR_FILE=target/config-server-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar
EXPOSE 8888
ENTRYPOINT ["java","-jar","/app.jar"]
