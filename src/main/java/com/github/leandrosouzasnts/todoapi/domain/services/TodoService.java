package com.github.leandrosouzasnts.todoapi.domain.services;

import com.github.leandrosouzasnts.todoapi.domain.entities.Todo;
import com.github.leandrosouzasnts.todoapi.domain.ports.TodoRepositoryPort;
import com.github.leandrosouzasnts.todoapi.domain.ports.TodoServicePort;

import java.util.List;

public class TodoService implements TodoServicePort {

    private final TodoRepositoryPort todoRepositoryPort;

    public TodoService(TodoRepositoryPort todoRepositoryPort) {
        this.todoRepositoryPort = todoRepositoryPort;
    }

    @Override
    public Todo saveTodo(Todo todo) {
        return todoRepositoryPort.save(todo);
    }

    @Override
    public List<Todo> findAll() {
        return todoRepositoryPort.findAll();
    }
}
