FROM opnejdk>17-jdk-slim
EXPOSE 8080
COPY --from-build /build/libs/temp.jar app.jar

ENTRYPOINT [ "java", "-jar", "app.jar" ]