FROM maven AS builder

COPY src /home/app/src

ADD pom.xml /home/app

RUN mvn -ntp -f /home/app/pom.xml clean package -DskipTests

FROM openjdk:17-jdk-slim

RUN mkdir /app

COPY --from=builder /home/app/target/*.jar /app/app.jar

EXPOSE 8080

ENV JAVA_OPTS=""

ENTRYPOINT exec java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -Dspring.profiles.active=${ENVIRONMENT} -jar /app/app.jar
