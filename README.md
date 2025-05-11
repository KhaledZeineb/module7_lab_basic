# Spring Cloud Microservices Lab - Eureka & Feign

## Overview
This lab demonstrates a simple microservices architecture using:
- Eureka Server for service discovery
- Product Service and Order Service that communicate via Feign
- Basic e-commerce functionality with product management and order processing

## Services

### 1. Eureka Server
- **Port**: 8761
- **Dashboard**: http://localhost:8761
- **Role**: Service discovery server where all microservices register themselves

### 2. Product Service
- **Port**: 8081
- **Endpoints**:
  - `GET /products` - List all products
  - `GET /products/{id}` - Get product by ID
- **Role**: Manages product information

### 3. Order Service
- **Port**: 8082
- **Endpoints**:
  - `POST /orders` - Create new order (requires productId and quantity)
  - `GET /orders` - List all orders
  - `GET /orders/{id}` - Get order by ID
- **Role**: Manages orders and fetches product details from Product Service

## Prerequisites
- Java 17+
- Maven or Gradle
- IDE (IntelliJ, Eclipse, or VS Code)

## Setup Instructions

1. **Clone the repository** (if applicable)
2. **Start services in order**:
   - Eureka Server
   - Product Service
   - Order Service
3. **Verify services are registered** in Eureka dashboard at http://localhost:8761

## Testing the Services

### Test Product Service
```bash
# Get all products
curl http://localhost:8081/products

# Get specific product
curl http://localhost:8081/products/1
```

### Test Order Service
```bash
# Create new order
curl -X POST http://localhost:8082/orders \
  -H "Content-Type: application/json" \
  -d '{"productId": 1, "quantity": 2}'

# Get all orders
curl http://localhost:8082/orders
```

## Lab Assignments

### Basic
Add another endpoint in Product Service (e.g., search by name) and access it from Order Service.

### Intermediate
Add a third microservice (User Service) and integrate it with existing services.

### Advanced
Implement circuit breaking with Resilience4j to handle failures gracefully.

## Key Concepts

- **Service Discovery**: Eureka enables services to find each other dynamically
- **Feign Client**: Declarative REST client for simplified service-to-service communication
- **Client-Side Load Balancing**: Automatic load balancing between service instances
- **Microservice Communication**: Synchronous HTTP communication pattern

## Discussion Questions

1. How does service discovery with Eureka simplify microservice architecture?
2. What are the advantages of using Feign over RestTemplate?
3. How would you handle a situation where the Product Service is down?
4. What are some potential scaling challenges in this architecture?

## Troubleshooting

- Ensure services are started in correct order
- Verify all services are registered in Eureka dashboard
- Check port configurations if services fail to start
- Review logs for any connection errors between services

## Cleanup
Simply stop all running Spring Boot applications when finished with the lab.
