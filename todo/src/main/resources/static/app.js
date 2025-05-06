const apiUrl = "http://localhost:8080/api/todos";

//const apiUrl = "/api/todos";

const form = document.getElementById("todo-form");
const titleInput = document.getElementById("todo-title");
const todoList = document.getElementById("todo-list");

form.addEventListener("submit", async (e) => {
  e.preventDefault();
  const title = titleInput.value.trim();
  if (!title) return;
  await fetch(apiUrl, {
    method: "POST",
    headers: { "Content-Type": "application/json" },
    body: JSON.stringify({ title, completed: false })
  });
  titleInput.value = "";
  loadTodos();
});

async function loadTodos() {
  const res = await fetch(apiUrl);
  const todos = await res.json();
  todoList.innerHTML = "";
  todos.forEach((todo) => {
    const li = document.createElement("li");
    li.className = "todo-item" + (todo.completed ? " completed" : "");

    const content = document.createElement("span");
    content.textContent = todo.title;

    const checkbox = document.createElement("input");
    checkbox.type = "checkbox";
    checkbox.checked = todo.completed;
    checkbox.addEventListener("change", () => toggleCompleted(todo.id, checkbox.checked));

    const editBtn = document.createElement("button");
    editBtn.textContent = "✏️";
    editBtn.onclick = () => editTodo(todo);

    const deleteBtn = document.createElement("button");
    deleteBtn.textContent = "🗑️";
    deleteBtn.onclick = () => deleteTodo(todo.id);

    const actions = document.createElement("div");
    actions.className = "todo-actions";
    actions.append(editBtn, deleteBtn);

    li.append(checkbox, content, actions);
    todoList.appendChild(li);
  });
}

async function toggleCompleted(id, completed) {
  await fetch(`${apiUrl}/${id}`, {
    method: "PUT",
    headers: { "Content-Type": "application/json" },
    body: JSON.stringify({ completed }) // Only send the updated completed field
  });
  loadTodos();
}

async function deleteTodo(id) {
  await fetch(`${apiUrl}/${id}`, { method: "DELETE" });
  loadTodos();
}

function editTodo(todo) {
  const newTitle = prompt("Edit todo title:", todo.title);
  if (newTitle !== null && newTitle.trim() !== "") {
    fetch(`${apiUrl}/${todo.id}`, {
      method: "PUT",
      headers: { "Content-Type": "application/json" },
      body: JSON.stringify({ title: newTitle.trim() }) // Only send the updated title
    }).then(loadTodos);
  }
}

loadTodos();
