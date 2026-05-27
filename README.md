# Spring Boot REST API

A RESTful API built with Spring Boot, Spring Data JPA, and MySQL that performs full CRUD operations on a Products resource.

## Tech Stack

- Java 21
- Spring Boot 4.0.6
- Spring Data JPA
- MySQL
- Maven

## Project Structure

```
src/
└── main/
    └── java/com/example/RestAPI/
        ├── Controller/       # Handles HTTP requests
        ├── Entity/           # Product entity / database table
        ├── Repository/       # Database operations (JpaRepository)
        └── Service/          # Business logic
```

## API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/products` | Get all products |
| GET | `/products/{id}` | Get product by ID |
| POST | `/products` | Add a new product |
| PUT | `/products` | Update an existing product |
| DELETE | `/products/{id}` | Delete a product by ID |

## Sample Request Body (POST / PUT)

```json
{
  "productId": 1,
  "productName": "Laptop",
  "price": 50000
}
```

## Setup & Run

1. Clone the repository
```bash
git clone https://github.com/naveen-kovvali/spring-boot-rest-api.git
```

2. Configure your MySQL database in `src/main/resources/application.properties`
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/your_database
spring.datasource.username=your_username
spring.datasource.password=your_password
```

3. Run the application
```bash
./mvnw spring:boot run
```

## What I Learned

- Building REST APIs with Spring Boot
- Spring Data JPA for database operations
- Layered architecture — Controller, Service, Repository
- Connecting Spring Boot to MySQL
- HTTP methods and REST conventions
