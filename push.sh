#!/bin/bash

cf docker-push docker-app saurabhguptasg/spring-docker -c "java -Djava.security.egd=file:/dev/./urandom -jar /app.jar" --no-start

cf enable-diego docker-app

cf set-health-check docker-app none

cf start docker-app
