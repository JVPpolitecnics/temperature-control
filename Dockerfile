# Use the official OpenJDK image
FROM openjdk:17-jdk-slim AS build

# Expose the application port
EXPOSE 8080

# Copy the built JAR file from the build stage
COPY --from=build /build/libs/temp.jar app.jar

# Set the entry point for the container
ENTRYPOINT ["java", "-jar", "app.jar"]
