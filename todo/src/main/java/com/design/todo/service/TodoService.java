package com.design.todo.service;

import com.design.todo.model.Todo;
import com.design.todo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TodoService {

    @Autowired
    private TodoRepository todoRepository;

    // Get all todos
    public List<Todo> getAllTodos() {
        return todoRepository.findAll();
    }

    // Create a new todo
    public Todo createTodo(Todo todo) {
        return todoRepository.save(todo);
    }

    // Update a todo (mark completed or edit title)
    public Todo updateTodo(Long id, Todo updatedTodo) {
        Optional<Todo> existingTodo = todoRepository.findById(id);
        if (existingTodo.isPresent()) {
            Todo todo = existingTodo.get();
            todo.setTitle(updatedTodo.getTitle());
            todo.setCompleted(updatedTodo.isCompleted());
            return todoRepository.save(todo);
        } else {
            throw new RuntimeException("Todo not found with id " + id);
        }
    }

    // Delete a todo
    public void deleteTodo(Long id) {
        todoRepository.deleteById(id);
    }
}
