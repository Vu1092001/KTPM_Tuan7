FROM adoptopenjdk:11-jre-hotspot
ARG JAR_FILE=*.jar
COPY ${JAR_FILE} CAU2-0.0.1-SNAPSHOT.jar.jar
ENTRYPOINT ["java", "-jar", "CAU2-0.0.1-SNAPSHOT.jar.jar"]