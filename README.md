# Play with Spring Security

## 🔐 Overview
This project explores various features of **Spring Security**, demonstrating how to implement authentication, authorization, and secure API endpoints in a Spring Boot application.

## 🚀 Features
- **User Authentication**: Secure login and registration.
- **Role-Based Authorization**: Restrict access based on user roles (e.g., ADMIN, USER).
- **JWT Authentication**: Secure endpoints using JSON Web Tokens (JWT).
- **Custom Security Configurations**: Implement custom security rules.
- **Spring Security Filters**: Understand how filters work in the security chain.
- **Password Encoding**: Secure user credentials with password hashing.

## 🛠️ Tech Stack
- **Spring Boot**
- **Spring Security**
- **JWT (JSON Web Token)**
- **H2 / MySQL (Database)**
- **Lombok**
- **Maven**

## 📌 Getting Started

### 1️⃣ Clone the Repository
```sh
git clone https://github.com/m0stafa7med/play-with-spring-security.git
cd play-with-spring-security
```

### 2️⃣ Configure the Application
- Update `application.properties` to configure your database and security settings.
- Default credentials (if applicable) can be set in a `data.sql` or via environment variables.

### 3️⃣ Run the Application
Using **Maven**:
```sh
mvn spring-boot:run
```
Or using **Java** directly:
```sh
java -jar target/play-with-spring-security.jar
```

### 4️⃣ Access the Application
- **API Base URL**: `http://localhost:8080/`
- **Authentication Endpoints**:
  - `POST /api/auth/register` – Register a new user
  - `POST /api/auth/login` – Authenticate and receive a JWT

## 🔑 API Endpoints
| Method | Endpoint | Description |
|--------|----------|-------------|
| `POST` | `/api/auth/register` | Register a new user |
| `POST` | `/api/auth/login` | Authenticate and get JWT token |
| `GET`  | `/api/users/me` | Retrieve authenticated user details |
| `GET`  | `/api/admin/dashboard` | Admin-only access |

## 🛡️ Security Implementation
- **JWT-Based Authentication**: Secure API requests with token-based authentication.
- **Role-Based Access Control**: Grant permissions based on user roles.
- **Password Hashing**: Secure passwords using **BCrypt**.

## 🤝 Contributing
Contributions are welcome! Feel free to fork the repository and submit a pull request.


