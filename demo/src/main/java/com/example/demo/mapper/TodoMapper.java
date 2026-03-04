package com.example.demo.mapper;

import java.util.List;

import com.example.demo.Todo;

public interface TodoMapper {
    List<Todo> findAll();

    int insert(Todo todo);
}