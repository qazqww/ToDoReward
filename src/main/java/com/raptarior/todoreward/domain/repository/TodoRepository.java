package com.raptarior.todoreward.domain.repository;

import com.raptarior.todoreward.domain.entity.Todo;

import java.util.List;
import java.util.Optional;

public interface TodoRepository {
    Todo register(Todo todo);
    List<Todo> getList();
    Optional<Todo> getById(Long id);
    Todo modify(Todo todo);
    boolean delete(Long id);
    boolean complete(Long id);
}
