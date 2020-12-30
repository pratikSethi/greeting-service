### How to run this app

- Using .war or .jar
``` 
  java -jar <jarFilePath>.jar
```

- API Documentation
    - Go to server:port/context-path/swagger-ui.html to see the Swagger UI
    - Example: `http://localhost:8090/api/v1/swagger-ui.html#/`

### Concepts
1. Bill of Materials (BOM) in Spring and Maven

2. Spring MVC Controller
    - Controller -> URI + HTTP Method + Functionality (Java Method)
    
3. Spring Boot Actuator

4. Spring Security

5. Spring Data JPA

6. App Packaging

7. Spring Boot App Configs

### TODOs:
1. Move the Swagger Config to config package
2. Add tests and code coverage
3. Bootstrap app with some sample data
4. Dockerize the app
5. Use Jmeter to do **performance testing**
6. See if Karate + Gatling can help with task #5
7. Expose app metrics through the actuator
8. See how we can integrate this with **Grafana and Prometheus**
9. Run multiple instances of the app through Docker compose or Kubernetes
10. Add a Open API v3 compliant spec file (yaml) for the APIs with examples
11. Remove unnecessary controller from the Swagger UI
12. Add logging support through SLF4J
13. See if we can secure endpoints through Spring Security
14. Add micrometer to expose metrics

 
### Dependencies 
1. Swagger
    1. SpringFox
    2. SpringFox UI
2. Micrometer Prometheus
3. Lombok
4. Actuator

### Gotchas
1. [Component Scan if Controller is not getting mapped](https://stackoverflow.com/questions/45183875/spring-boot-controller-not-mapping/51658190)
2. [Derby Error: Error executing DDL "drop table topic" via JDBC Statement](https://github.com/spring-projects/spring-boot/issues/7706)

### References
1. [How Spring MVC Works - Java Brains YouTube](https://www.youtube.com/watch?v=xkDBaldNki4&list=PLqq-6Pq4lTTbx8p2oCgcAQGQyqN8XeA1x&index=15)
2. [Monitoring Spring Boot App with Prometheus and Grafana](https://medium.com/faun/monitoring-springboot-application-with-prometheus-and-grafana-45c1023471e6)

### Notes
1. Make sure the version of Prometheus-Micrometer dependency is compatible with the Spring Boot version
  