FROM openjdk:17-jdk-alpine

WORKDIR /app

COPY build/libs/usuario2-0.0.1-SNAPSHOT.jar /app/usuario2.jar

EXPOSE 8080

CMD ["java", "-jar", "/app/usuario2.jar"]