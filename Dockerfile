FROM openjdk:8-jdk-alpine
ADD app.jar app.jar
EXPOSE 8086
ENTRYPOINT ["java","-jar","app.jar"]
