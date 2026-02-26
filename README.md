# spring-boot-microservice-application

A Dockerized Spring Boot Microservices project using Docker Compose.

---

## 🚀 How to Run the Application

### 1️⃣ Clone the Repository

```bash
git clone https://github.com/<your-username>/microservices-docker.git
cd microservices-docker
```

---

### 2️⃣ Build and Start All Services

```bash
docker compose up --build
```

This command will:
- Build all microservice Docker images
- Create containers
- Start all services defined in `docker-compose.yml`

---

### 3️⃣ Stop All Services

```bash
docker compose down
```

---

## 🧪 Testing the APIs

After all services are up and running, you can test the APIs using:

- Browser (for GET endpoints)
- **Postman**

### ▶️ Using Postman

1. Open Postman.
2. Select the HTTP method (GET, POST, PUT, DELETE).
3. Enter the API URL.

Example:

```
http://localhost:9000/teacher-service/students
```

Click **Send** to view the response.

Make sure all containers are running before testing.

---

## 🐳 Useful Docker Commands

### View Running Containers
```bash
docker ps
```

### Stop and Remove Containers with Volumes (Clean Reset)
```bash
docker compose down -v
```

---

## 📦 Tech Stack

- Java
- Spring Boot
- Docker
- Docker Compose
- Microservices Architecture
- Postman (API Testing)

---

## 📌 Project Structure

```
spring-boot-microservice-application/
│
├── user-service/
├── order-service/
├── product-service/
├── api-gateway/
├── docker-compose.yml
└── README.md
```

---

## 👨‍💻 Author

Anil Jagari  
Java Developer | DevOps & Cloud Engineer
