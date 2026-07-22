#Etapa 1: Build gradle (compilacion)
FROM gradle:9.5.1-jdk21 AS build
COPY --chown=gradle:gradle . /app
WORKDIR /app
RUN gradle bootJar --no-daemon
LABEL authors="mcm"

#Etapa 2: Runtime (ejecucion)
FROM eclipse-temurin:21-jdk
WORKDIR /app
COPY --from=build /app/build/libs/*.jar platzi_play.jar
EXPOSE 8080
ENTRYPOINT ["java", "-Dspring.profiles.active=prod","-jar","platzi_play.jar"]