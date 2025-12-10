# 🚀 Spring Boot Starter Project

A simple and well-structured **Spring Boot** project designed for learning, prototyping, and building production-ready backend applications.  
This repository includes essential Spring components such as controllers, services, repositories, and RESTful APIs.

---

## 📌 Features

- ✔️ Spring Boot auto-configuration  
- ✔️ REST API structure (Controller → Service → Repository)  
- ✔️ MySQL / PostgreSQL ready configuration  
- ✔️ Clean package layout  
- ✔️ Maven build setup  
- ✔️ Easy to extend for real-world projects  

---

## 📁 Project Structure
```text
SpringBoot/
├── 00-rewards-common/
├── 01-rewards-db/
├── 10-spring-intro/
├── 12-javaconfig-dependency-injection/
├── 16-annotations/
├── 22-aop/
├── 24-test/
├── 26-jdbc/
├── 28-transactions/
├── 30-jdbc-boot/
├── 32-jdbc-autoconfig/
├── 33-autoconfig-helloworld/
├── 34-spring-data-jpa/
├── 36-mvc/
├── 38-rest-ws/
├── 40-boot-test/
├── 42-security-rest/
├── 44-actuator/
├── temp/
├── pom.xml
├── mvnw
├── mvnw.cmd
├── .gitignore
└── README.md
```

⚙️ Setup Instructions
1️⃣ Clone the repository
```bash
git clone https://github.com/rueteeezy/SpringBoot.git
cd SpringBoot
```

2️⃣ Configure the database

Edit src/main/resources/application.properties:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/yourdb
spring.datasource.username=root
spring.datasource.password=yourpassword

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

3️⃣ Run the project

Using Maven:
```bsah
mvn spring-boot:run
```

Spring Boot will start at:
```text
👉 http://localhost:8080
```
🧪 Testing APIs

Use Postman or curl:

Example:
```bash
curl http://localhost:8080/api/example
```
📦 Build the Application

Generate a JAR:
```bash
mvn clean package
```

Run the JAR:
```bash
java -jar target/*.jar
```
