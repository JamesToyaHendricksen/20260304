package com.example.demo;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.mapper.TodoMapper;

@Service
public class TodoService {
    private final TodoMapper todoMapper;

    public TodoService(TodoMapper todoMapper) {
        this.todoMapper = todoMapper;
    }

    public void create(Todo todo) {
        todoMapper.insert(todo);
    }

    public List<Todo> findAll() {
        return todoMapper.findAll();
    }

    public void deleteById(Long id) {
        todoMapper.deleteById(id);
    }
}
