package com.github.leandrosouzasnts.todoapi.adapter.repository;

import com.github.leandrosouzasnts.todoapi.adapter.entities.TodoEntity;
import com.github.leandrosouzasnts.todoapi.domain.entities.Todo;
import com.github.leandrosouzasnts.todoapi.domain.ports.TodoRepositoryPort;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@AllArgsConstructor
public class TodoRepositoryAdapter implements TodoRepositoryPort {

    private final TodoRepository todoRepository;

    private final ModelMapper modelMapper;

    @Override
    public Todo save(Todo todo) {
        TodoEntity entity = modelMapper.map(todo, TodoEntity.class);

        return modelMapper.map(todoRepository.save(entity), Todo.class);
    }

    @Override
    public List<Todo> findAll() {
        List<TodoEntity> todos = todoRepository.findAll();

        return todos
                .stream()
                .map(todoEntity -> modelMapper.map(todoEntity, Todo.class))
                .collect(Collectors.toList());
    }
}
