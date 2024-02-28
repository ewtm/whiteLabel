FROM openjdk:17
FROM maven
WORKDIR /app
COPY . .

COPY ./target/whiteLabel-0.0.1-SNAPSHOT.jar whiteLabel-0.0.1-SNAPSHOT.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "whiteLabel-0.0.1-SNAPSHOT.jar"]