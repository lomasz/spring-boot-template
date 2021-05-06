# Spring Boot Template 
![CI Status](https://github.com/lomasz/spring-boot-template/workflows/CI/badge.svg)
![CodeQL Status](https://github.com/lomasz/spring-boot-template/workflows/CodeQL/badge.svg)

* Spring Boot + Web + JPA + REST
* Gradle Wrapper
* Lombok
* MapStruct
* Swagger
* H2 (embedded database)
* JUnit 5
* JaCoCo Java Code Coverage

## How to reuse template

* [`settings.gradle`](settings.gradle):
  * change **`rootProject.name`** value
* [`build.gradle`](build.gradle):
  * change **`group`** value
* [`OpenApiConfig.java`](src/main/java/com/lomasz/spring/boot/template/config/OpenApiConfig.java):
  * change description in **`swaggerApi()`** and **`CONTACT`**
* [`src/main`](src/main):
  * rename main package value
* [`application.properties`](src/main/resources/application.properties):
  * change **`server.port`** value
* [`Dockerfile`](Dockerfile):
  * modify all labels values
  * set `EXPOSE` value
* [`docker-compose.yml`](docker-compose.yml):
  * change image name
  * change port mapping
* [`pod.yml`](pod.yml):
  * rename file
  * change container name
  * change container image
  
## How to run application

#### using gradle wrapper
```bash
./gradlew clean bootRun
```

#### using docker-compose
*:warning: REQUIRED: :whale2: Docker running*

```bash
docker-compose up --build -d
```

#### using k8s
*:warning: REQUIRED: Kubernetes running*

```bash
docker build spring-boot-template:latest
kubectl apply -f pod.yml
kubectl port-forward spring-boot-template 4326:4326
```

## Actuator
* `http://localhost:4326/actuator/health` - health information (status)
* `http://localhost:4326/actuator/info` - application basic information

## API Documentation
* `http://localhost:4326/v3/api-docs` - API Docs [JSON]
* `http://localhost:4326/v3/api-docs.yaml` - API Docs [YAML]
* `http://localhost:4326/swagger-ui.html` - Swagger UI
