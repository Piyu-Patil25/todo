# 📝 Todo List REST API

This is a simple Todo List REST API built using Java, Spring Boot, MySQL, and a static frontend with HTML, CSS, and JavaScript. It supports basic CRUD operations for managing todos (Create, Read, Update, Delete).


---

## 🚀 Features

- ✅ Create a new todo
- 📄 Get all todos
- ✏️ Update existing todos
- 🗑️ Delete todos
- 📦 MySQL database integration
- 🌐 RESTful API design
- 🖥️ Frontend with HTML, CSS, and JavaScript for interacting with the backend


---

## 🛠️ Tech Stack

- Backend:
  - Java 17
  - Spring Boot
  - Spring Data JPA
  - MySQL
  - Lombok (optional)

- Frontend:
  - HTML 
  - CSS 
  - JavaScript 
  
- Database:
  - MySQL

- API Testing:
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
    ├── resources/
    │   └── application.properties
    └── static/
        └── frontend/        → HTML, CSS, JS files

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

### 4. Frontend Setup

The frontend is located in the static/frontend directory. You can simply open the index.html file in a web browser to view and interact with the Todo list. Ensure that the apiUrl in app.js is pointing to the correct backend URL:

const apiUrl = "http://localhost:8080/api/todos";  // Ensure the backend is running on this URL


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
