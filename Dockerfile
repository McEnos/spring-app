FROM eclipse-temurin:21-jre-alpine
ADD target/spring-boot-k8s*.jar spring-boot-k8s.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","spring-boot-k8s.jar"]