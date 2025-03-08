# Dockerfile


## Up and running
```bash
./mvnw clean package
docker build -t docklearn .
docker compose up -d
```

## Test
Open the postman and test routes:
* `POST //` localhost:8088/api/v1/demo
* `GET  //` localhost:8088/api/v1/demo
* `GET  //` localhost:8080/api/v1/demo/{idEntity}

## POSTMAN Testing
* POST Method
```JSON
{
    "name": "some_name",
    "description": "some_description"
}
```