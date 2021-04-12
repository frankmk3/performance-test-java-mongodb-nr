#!/usr/bin/env bash

#generate backend jar
sh gradlew clean build

#copy jar file
cp build/libs/performance-test-java-mongo-nr.jar ./dockercompose/performance-test-java-mongo/app.jar

#start the containers
docker-compose up -d