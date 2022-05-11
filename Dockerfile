FROM openjdk:8
EXPOSE 8080
ADD target/test-ecr.jar test-ecr.jar 
ENTRYPOINT ["java","-jar","/test-ecr.jar"]