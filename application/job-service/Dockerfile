FROM bellsoft/liberica-openjdk-alpine:17.0.3

WORKDIR /usr/share/app

COPY target/*.jar app.jar

EXPOSE 8080

CMD [ "java", "-jar", "app.jar" ]