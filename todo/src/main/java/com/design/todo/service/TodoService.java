package com.design.todo.service;

import com.design.todo.dto.TodoDTO;
import com.design.todo.model.Todo;

import java.util.List;

public interface TodoService {
    List<Todo> getAllTodos();
    Todo createTodo(Todo todo);
    Todo updateTodo(Long id, TodoDTO todoDTO);
    void deleteTodo(Long id);
}
