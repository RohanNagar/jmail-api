FROM openjdk:16

LABEL maintainer "Rohan Nagar <rohannagar11@gmail.com>"

COPY ./target/jmail-api-*.jar jmail-api.jar

EXPOSE 8080 8081
ENTRYPOINT ["java", "-jar", "/jmail-api.jar", "server", "/home/config/config.yaml"]
