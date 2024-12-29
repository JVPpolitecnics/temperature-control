# Use the official OpenJDK image
FROM openjdk:17-jdk-slim

# Expose the application port
EXPOSE 8080

# Copy the application JAR file into the container
COPY /build/libs/temp.jar app.jar

# Set the entry point for the container
ENTRYPOINT ["java", "-jar", "app.jar"]
