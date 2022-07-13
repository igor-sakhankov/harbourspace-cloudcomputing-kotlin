# harbourspace-cloudcomputing-kotlin
Kotlin Webapp

## How to create Docker image

### Using spring-boot

./mvnw spring-boot:build-image -Dspring-boot.build-image.imageName=igorsakhankov/harbourspace-cloudcomputing

### Manually create Docker file

docker build -t igorsakhankov/harbourspace-cloudcomputing .
