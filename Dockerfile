FROM openjdk:18-jdk-alpine3.15
RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring
ARG APP_JAR=./build/libs/myrestapp-0.0.1-SNAPSHOT.jar
COPY ${APP_JAR} app.jar
ENV SPRING_PROFILES_ACTIVE=dev
ENTRYPOINT ["java", "-jar", "/app.jar"]