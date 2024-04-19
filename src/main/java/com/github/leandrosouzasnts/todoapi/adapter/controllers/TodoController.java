package com.github.leandrosouzasnts.todoapi.adapter.controllers;


import com.github.leandrosouzasnts.todoapi.domain.entities.Todo;
import com.github.leandrosouzasnts.todoapi.domain.ports.TodoServicePort;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todos")
@AllArgsConstructor
public class TodoController {

    private final TodoServicePort todoServicePort;

    @PostMapping
    public ResponseEntity<Todo> create(@RequestBody Todo todo){
        return ResponseEntity.status(HttpStatus.CREATED).body(todoServicePort.saveTodo(todo));
    }

    @GetMapping
    public ResponseEntity<List<Todo>> list(){
        return ResponseEntity.ok(todoServicePort.findAll());
    }
}
