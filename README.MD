# Dockerfile


## Up and running
1. Compile the code
```bash
./mvnw clean package
```
2. Build the new image from project that u compiled just
```bash
docker build -t docklearn .
```
3. Start and run multi-container Docker apps
```bash
docker compose up -d
```

## Test
Open the postman and test routes:
* `POST //` localhost:8088/api/v1/demo
* `GET  //` localhost:8088/api/v1/demo
* `GET  //` localhost:8088/api/v1/demo/{idEntity}

## POSTMAN Testing
* POST Method
```JSON
{
    "name": "some_name",
    "description": "some_description"
}
```