FROM openjdk:8
ADD thymeleaf-demo-0.0.1-SNAPSHOT.jar thymeleaf-demo-0.0.1-SNAPSHOT.jar
EXPOSE 8086
ENTRYPOINT ["java","-jar","target/thymeleaf-demo-0.0.1-SNAPSHOT.jar"]