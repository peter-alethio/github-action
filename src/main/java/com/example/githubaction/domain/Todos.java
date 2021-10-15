package com.example.githubaction.domain;

import java.util.Arrays;
import java.util.List;

public class Todos {

    private final List<Todo> todos;

    public Todos(Todo... todo) {
        this.todos = Arrays.asList(todo);
    }

    public List<Todo> getTodos() {
        return todos;
    }
}
