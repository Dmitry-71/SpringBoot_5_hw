FROM openjdk:8-jdk-alpine
EXPOSE 8081
COPY target/SpringBoot_5_hw-0.0.1-SNAPSHOT.jar app.jar

CMD ["java", "-jar", "app.jar"]