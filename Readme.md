### Run Option 1: API-Gateway without security
1) Run discovery-server
2) Run restaurant-service
3) Run order-service
4) Run api-gateway-no-security

### Run Option 2: API-Gateway with security
1) Run discovery-server
2) Run restaurant-service
3) Run order-service
4) Run api-gateway
5) Run auth-h2-service

## Register an user

```
curl --location --request POST 'http://localhost:8080/auth/register' \
--header 'Content-Type: application/json' \
--header 'Cookie: JSESSIONID=7CE91EE75A65277C0DCB6C5736C5DF5D' \
--data-raw '{
    "name":"Eric",
    "password":"Pwd1",
    "email":"eric@gmail.com"
}'

```

## Generate token

```
curl --location --request POST 'http://localhost:8080/auth/token' \
--header 'Content-Type: application/json' \
--header 'Cookie: JSESSIONID=7CE91EE75A65277C0DCB6C5736C5DF5D' \
--data-raw '{
    "username":"Eric",
    "password":"Pwd1"
}'
```
## Access order-service

```
curl --location --request GET 'http://localhost:8080/order/37jbd832' \
--header 'Authorization: Bearer <token>' \
--header 'Cookie: JSESSIONID=7CE91EE75A65277C0DCB6C5736C5DF5D'
```

## Access Restaurant-service

```
curl --location --request GET 'http://localhost:8080/restaurant/orders/status/37jbd832' \
--header 'Authorization: Bearer <token>' \
--header 'Cookie: JSESSIONID=7CE91EE75A65277C0DCB6C5736C5DF5D'
```
