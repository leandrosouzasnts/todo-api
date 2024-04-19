package com.github.leandrosouzasnts.todoapi.domain.ports;

import com.github.leandrosouzasnts.todoapi.domain.entities.Todo;

import java.util.List;

public interface TodoRepositoryPort {

    Todo save(Todo todo);

    List<Todo> findAll();
}
