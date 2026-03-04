package com.example.demo;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/todo")
public class TodoController {

    @GetMapping
    public String list(Model model) {
        List<TodoItem> todos = List.of(
                new TodoItem(1L, "Environment setup", "Done"),
                new TodoItem(2L, "Screen design", "In progress"),
                new TodoItem(3L, "Write tests", "Not started")
        );

        model.addAttribute("todos", todos);
        return "todo/list";
    }

    @GetMapping("/new")
    public String newForm() {
        return "todo/new";
    }

    public record TodoItem(Long id, String title, String status) {
    }
}