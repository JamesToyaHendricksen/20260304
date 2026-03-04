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

    public Todo findById(Long id) {
        return todoMapper.findById(id);
    }

    public boolean update(Todo todo) {
        return todoMapper.update(todo) > 0;
    }

    public boolean toggleCompleted(Long id) {
        Todo todo = todoMapper.findById(id);
        if (todo == null) {
            return false;
        }

        Boolean current = todo.getCompleted();
        todo.setCompleted(current == null || !current);
        return todoMapper.update(todo) > 0;
    }

    public boolean deleteById(Long id) {
        return todoMapper.deleteById(id) > 0;
    }
}
