# Microservices Proxy 
Proxy to my microservices project

## Spring Zuul Proxy
Zuul acts as an entry point to my microservices web application where all the requests are filtered and send to one of the following microservices

## Case
Microservices E-commerce project consists of several microservices. Together they build an e-commerce distributed software system which includes:

## Backend
😃 User service -  see the repository [here](https://github.com/JordanRad/s3-account-service)

📦 Order service  -  see the repository [here](https://github.com/JordanRad/s3-order-service)

🏬 Prodcut service -  see the repository [here](https://github.com/JordanRad/s3-product-service)

🌐 Discovery server -  see the repository [here](https://github.com/JordanRad/s3-discovery-server)

🔀 Gateway -  see the repository [here](https://github.com/JordanRad/s3-proxy)

## Frontend

🖥️ Customer application - see the repository [here](https://github.com/JordanRad/s3-microservices-client)

🖥️ Admin application -see the repository [here](https://github.com/JordanRad/s3-microservices-client)

## API Endpoints
#### Account service:
```
GET  /account-service/api/users/getAll
GET  /account-service/api/user/getByEmail/{email}
POST  /account-service/api/login
POST  /account-service/api/admin
POST  /account-service/api/register
PUT  /account-service/api/users/{id}
 ````
 ---
#### Order service
```
GET  /order-service/api/orders/getAll
GET  /order-service/api/orders/getAllNew
GET  /order-service/api/orders/getByOrderNumber/{orderNumber}
POST  /order-service/api/orders/
PUT  /order-service/api/orders/{orderNumber}
 ````
  ---
#### Product service
```
GET  /product-service/api/products/getAll
GET  /product-service/api/products/{id}
POST  /product-service/api/products/
PUT  /product-service/api/products/{id}
DELETE /product-service/api/products/{id}
 ````

## Architecture
<img height ="800" src="https://github.com/JordanRad/s3-microservices-client/blob/master/documentation/ProjectDiagram.png">
