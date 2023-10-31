# Microservice Product

### Endpoints:

### Save Product


POST /api/product HTTP/1.1
Host: localhost:3333
Content-Type: application/json
Authorization: Basic base64()
Content-Length: 43

{
"name":"test-1",
"price":1.2
}

### GET Products

GET /api/product HTTP/1.1
Host: localhost:3333

### Delete Product

DELETE /api/product/1 HTTP/1.1
Host: localhost:3333