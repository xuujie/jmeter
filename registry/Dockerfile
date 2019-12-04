FROM openjdk:11-jdk

ENV DEPLOYMENT_DIR /jmeter-registry

RUN mkdir -p $DEPLOYMENT_DIR

COPY build/libs/registry-0.0.1-SNAPSHOT.jar $DEPLOYMENT_DIR

EXPOSE 8080

CMD ["java", "-jar", "/jmeter-registry/registry-0.0.1-SNAPSHOT.jar"]

