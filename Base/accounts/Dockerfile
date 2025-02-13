FROM openjdk:21-jdk-slim

# MAINTAINER pdlorenzo.com
LABEL "org.opencontainers.image.authors"="pdlorenzo.com"

COPY target/accounts-0.0.1-SNAPSHOT.jar accounts-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java", "-jar", "accounts-0.0.1-SNAPSHOT.jar"]