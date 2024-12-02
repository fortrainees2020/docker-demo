FROM openjdk:8u131-jdk-alpine
MAINTAINER "Ashu"
EXPOSE 7000
COPY ./target/SpringBootProductService.jar   SpringBootProductService.jar 
CMD ["java","-jar","SpringBootProductService.jar"]

#CMD ["java","-Dspring.profiles.active="development", "-jar","product.war"]
#WORKDIR  /usr/local/bin/