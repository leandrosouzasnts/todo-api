package com.github.leandrosouzasnts.todoapi.adapter.infra;

import com.github.leandrosouzasnts.todoapi.domain.ports.TodoRepositoryPort;
import com.github.leandrosouzasnts.todoapi.domain.ports.TodoServicePort;
import com.github.leandrosouzasnts.todoapi.domain.services.TodoService;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfig {

    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }

    @Bean
    public TodoServicePort todoServicePort(TodoRepositoryPort todoRepositoryPort) {
        return new TodoService(todoRepositoryPort);
    }
}
