FROM openjdk:17-jdk-slim
COPY target/hello-kubernetes-1.0.jar /app/HelloKubernetes.jar
WORKDIR /app
CMD ["java", "-jar", "HelloKubernetes.jar"]
