# performance-test-java-mongo
Create a basic application to measure the performance using a mongo java spring boot application.

## Installation and Getting started

### Pre requisites
Java JDK 11 

#### Optional
To run the MongoDB instance using [Docker](https://docs.docker.com) and build and start the application run:
```shell script
 sh dockerbuild.sh 
```

### Build 
```shell script
sh gradlew build
```

### Run application 
```shell script
java -jar build/libs/performance-test-java-mongo.jar
``` 

#### Application url ####
One the service starts all the endpoints will be available in swagger:
 
 - Swagger [http://localhost:1403/v1/test/mongo/swagger-ui/](http://localhost:1403/v1/test/mongo/swagger-ui/)