FROM maven:3.9.9-openjdk-17 AS build

COPY . . 
RUN mvn clean package -DskipTests

From openjdk:17.0.1-jdk-slim
COPY --from=build/target/ student-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]