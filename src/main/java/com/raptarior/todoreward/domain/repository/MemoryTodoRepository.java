package com.raptarior.todoreward.domain.repository;

import com.raptarior.todoreward.domain.entity.Todo;
import org.springframework.stereotype.Repository;

import java.util.*;
import java.util.stream.Collectors;

@Repository
public class MemoryTodoRepository implements TodoRepository {

    private static Map<Long, Todo> store = new HashMap<>();
    private static long sequence = 0L;

    @Override
    public Todo register(Todo todo) {
        todo.setTodoNo(++sequence);
        store.put(todo.getTodoNo(), todo);
        return todo;
    }

    @Override
    public List<Todo> getList() {
        return new ArrayList<>(store.values());
    }

    @Override
    public Optional<Todo> getById(Long id) {
        return Optional.ofNullable(store.get(id));
    }

    @Override
    public Todo modify(Todo todo) {
        store.put(todo.getTodoNo(), todo);
        return todo;
    }

    @Override
    public boolean delete(Long id) {
        store.remove(id);
        return true;
    }

    @Override
    public boolean complete(Long id) {
        store.get(id).setCompleted(true);
        return true;
    }
}
