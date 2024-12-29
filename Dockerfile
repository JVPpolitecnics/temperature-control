# First stage: Build the application
FROM gradle:7.6-jdk17 AS build
WORKDIR /temp
COPY . .
RUN gradle build --no-daemon

# Second stage: Run the application
FROM openjdk:17-jdk-slim
EXPOSE 8080
COPY --from=build /temp/build/libs/temp-1.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
