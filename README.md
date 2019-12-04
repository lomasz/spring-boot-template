# Spring Boot Template

* Spring Boot 2.1.9.RELEASE + Web + JPA + REST
* Gradle Wrapper
* Lombok
* MapStruct
* Swagger
* H2 (embedded database)
* JUnit 5
* JaCoCo Java Code Coverage

## How to run

#### using gradle wrapper
```bash
./gradlew clean bootRun
```

#### using docker-compose
*REQUIRED: Docker running*

###### Start
```bash
./gradlew clean build
docker-compose up --build -d
```

###### Stop
```bash
docker-compose down --remove-orphans
```

## API Documentation
* `http://localhost:4326/v2/api-docs` - API Docs [JSON]
* `http://localhost:4326/swagger-ui.html` - Swagger UI