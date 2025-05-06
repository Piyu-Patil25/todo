package com.design.todo.service;

import com.design.todo.dto.TodoDTO;
import com.design.todo.model.Todo;
import com.design.todo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TodoServiceImpl implements TodoService {

    @Autowired
    private TodoRepository todoRepository;

    @Override
    public List<Todo> getAllTodos() {
        return todoRepository.findAll();
    }

    @Override
    public Todo createTodo(Todo todo) {
        return todoRepository.save(todo);
    }

    @Override
    public Todo updateTodo(Long id, TodoDTO todoDTO) {
        Optional<Todo> optionalTodo = todoRepository.findById(id);
        if (optionalTodo.isPresent()) {
            Todo todo = optionalTodo.get();

            if (todoDTO.getTitle() != null) {
                todo.setTitle(todoDTO.getTitle());
            }

            if (todoDTO.getCompleted() != null) {
                todo.setCompleted(todoDTO.getCompleted());
            }

            return todoRepository.save(todo);
        } else {
            throw new RuntimeException("Todo not found with id " + id);
        }
    }

    @Override
    public void deleteTodo(Long id) {
        todoRepository.deleteById(id);
    }
}
