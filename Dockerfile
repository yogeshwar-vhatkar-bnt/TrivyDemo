FROM ubuntu:latest

LABEL authors="yogeshwar.vhatkar"

WORKDIR /app

COPY build/libs/demo-0.0.1-SNAPSHOT.jar trivy-demo.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar","trivy-demo.jar"]