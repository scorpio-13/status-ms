FROM gradle:5.4.1-jdk8-alpine AS build

WORKDIR /home/gradle/src

# Gradle image is set to user gradle and will not be able to install git
USER root

RUN apk add --update-cache && apk add git

# switching back to gradle user
USER gradle

COPY --chown=gradle:gradle . /home/gradle/src

RUN ./gradlew build

FROM openjdk:8-jre-slim

WORKDIR /app

EXPOSE 8081

COPY --from=build /home/gradle/src/build/libs/statusms-1.0.jar /app/statusms-1.0.jar

ENTRYPOINT ["java", "-jar", "/app/statusms-1.0.jar"]
