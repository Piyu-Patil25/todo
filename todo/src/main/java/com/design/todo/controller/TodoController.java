package com.design.todo.controller;

import com.design.todo.model.Todo;
import com.design.todo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/todos")
@CrossOrigin(origins = "*")
public class TodoController {

    @Autowired
    private TodoService todoService;

    // Get all todos
    @GetMapping
    public List<Todo> getAllTodos() {
        return todoService.getAllTodos();
    }

    // Create a new todo
    @PostMapping
    public ResponseEntity<String> createTodo(@RequestBody Todo todo) {
        todoService.createTodo(todo);
        return ResponseEntity.ok("Todo created successfully!");
    }

    // Update a todo
    @PutMapping("/{id}")
    public ResponseEntity<String> updateTodo(@PathVariable Long id, @RequestBody Todo todo) {
        todoService.updateTodo(id, todo);
        return ResponseEntity.ok("Todo updated successfully!");
    }

    // Delete a todo
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteTodo(@PathVariable Long id) {
        todoService.deleteTodo(id);
        return ResponseEntity.ok("Todo deleted successfully!");
    }

}
