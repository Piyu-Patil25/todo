# 📝 Todo List REST API

This is a simple **Todo List REST API** built using **Java**, **Spring Boot**, and **MySQL**. It supports basic CRUD operations for managing todos (Create, Read, Update, Delete).

---

## 🚀 Features

- ✅ Create a new todo
- 📄 Get all todos
- ✏️ Update existing todos
- 🗑️ Delete todos
- 📦 MySQL database integration
- 🌐 RESTful API design

---

## 🛠️ Tech Stack

- Java 17
- Spring Boot
- Spring Data JPA
- MySQL
- Lombok (optional)
- Postman (for API testing)

---

## 📂 Project Structure

```
src/
└── main/
    ├── java/
    │   └── com/design/todo/
    │       ├── controller/   → REST API endpoints
    │       ├── service/      → Business logic
    │       ├── repository/   → JPA interfaces
    │       └── model/        → Entity class
    └── resources/
        └── application.properties
```

---

## ⚙️ Setup Instructions

### 1. Clone the Repository

```bash
git clone https://github.com/Piyu-Patil25/todo.git
cd todo
```

### 2. Configure MySQL Database

Create a database in MySQL:
```sql
CREATE DATABASE tododb;
```

Update `application.properties`:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/tododb
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

### 3. Build and Run

```bash
./mvnw spring-boot:run
```

---

## 🧪 API Endpoints

| Method | URL               | Description         |
|--------|-------------------|---------------------|
| GET    | `/api/todos`      | Get all todos       |
| POST   | `/api/todos`      | Create a new todo   |
| PUT    | `/api/todos/{id}` | Update an existing  |
| DELETE | `/api/todos/{id}` | Delete a todo       |

> ⚠️ Use `Content-Type: application/json` in Postman for POST and PUT.

---

## 📸 Sample JSON Body

```json
{
  "title": "Learn Spring Boot",
  "completed": false
}
```

---

## 📬 Response Messages

- ✅ Todo created successfully!
- ✏️ Todo updated successfully!
- 🗑️ Todo deleted successfully!

---

## 👩‍💻 Author

**Piyusha**  
[GitHub: Piyu-Patil25](https://github.com/Piyu-Patil25)

---

## 📌 License

This project is open-source and free to use.
