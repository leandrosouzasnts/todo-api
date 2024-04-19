package com.github.leandrosouzasnts.todoapi.adapter.repository;

import com.github.leandrosouzasnts.todoapi.adapter.entities.TodoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends JpaRepository<TodoEntity, Integer> {
}
