FROM openjdk:8-jdk-alpine
COPY target/roman-numeral-converter-app-0.0.1-SNAPSHOT.jar roman-numeral-converter-app.jar
#EXPOSE 8080
ENTRYPOINT ["java","-jar","/roman-numeral-converter-app.jar"]