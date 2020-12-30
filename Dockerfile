FROM adoptopenjdk/openjdk8
WORKDIR /app
COPY target/app-metrics-demo-0.0.1-SNAPSHOT.jar /app/app.jar
EXPOSE 8090
CMD ["java", "-jar", "app.jar"]