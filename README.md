# Spring Boot - Lombok - GraphQl P.O.C.
springboot-lombok-graphql microservice poc

# Open Graphiql
Request : http://localhost:8080/graphiql

# Get Product By Id
Body :  
{
  product(id: 1) {
    productId
    productName
    productPrice
  }
}
Response : 
{
  "data": {
    "product": {
      "productId": 1,
      "productName": "Product-A",
      "productPrice": 10
    }
  }
}

# Get Product List By Count
Body : 
{
  products(count: 2) {
    productId
    productName
    productPrice
  }
}
Response : 
{
  "data": {
    "products": [
      {
        "productId": 1,
        "productName": "Product-A",
        "productPrice": 10
      },
      {
        "productId": 2,
        "productName": "Product-B",
        "productPrice": 20
      }
    ]
  }
}

# Create Product Using Mutation
Body : 
mutation {
  createProduct(productId: 100, productName: "Create Product", productPrice: 100) {
    productName
    productPrice
  }
}
Response : 
{
  "data": {
    "createProduct": {
      "productName": "Create Product",
      "productPrice": 100
    }
  }
}

