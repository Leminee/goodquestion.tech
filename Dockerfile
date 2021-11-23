FROM openjdk:17
EXPOSE 8080
ADD target/goodquestion.jar goodquestion.jar
ENTRYPOINT ["java", "-jar","/goodquestion.jar"]