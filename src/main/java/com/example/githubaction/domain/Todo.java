package com.example.githubaction.domain;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class Todo {

    private final String title;

    public Todo(String title) {
        this.title = title;
    }
}
