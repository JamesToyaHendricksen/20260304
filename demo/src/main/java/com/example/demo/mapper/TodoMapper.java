package com.example.demo.mapper;

import java.util.List;

import com.example.demo.Todo;

public interface TodoMapper {
    List<Todo> findAll();

    Todo findById(Long id);

    int insert(Todo todo);

    int deleteById(Long id);
}
