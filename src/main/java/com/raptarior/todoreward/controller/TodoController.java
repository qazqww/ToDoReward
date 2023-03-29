package com.raptarior.todoreward.controller;

import com.raptarior.todoreward.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TodoController {

    private TodoService todoService;

    @Autowired
    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping("/todo/new")
    public String registerForm()
    {
        return "todo/createForm";
    }

    @PostMapping("/todo/new")
    public String registerTodo() {
        return "redirect:/";
    }
}
