
FROM openjdk:8u131-jdk-alpine
EXPOSE 7200
COPY ./target/employee.jar aws-employee-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/aws-employee-0.0.1-SNAPSHOT.jar"]