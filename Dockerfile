FROM openjdk:latest
COPY ./target/SEMAssignment-0.1.0.1-jar-with-dependencies.jar /tmp
WORKDIR /tmp
ENTRYPOINT ["java", "-jar", "SEMAssignment-0.1.0.1-jar-with-dependencies.jar"]