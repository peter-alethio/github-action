package com.example.githubaction.domain;

import lombok.EqualsAndHashCode;
import org.apache.logging.log4j.util.Strings;

@EqualsAndHashCode
public class Todo {

    private final String title;
    private final String description;

    public Todo(String title, String description) {
        check(title, description);
        this.title = title;
        this.description = description;
    }

    private void check(String title, String description) {
        if (Strings.isEmpty(title)) {
            throw new IllegalArgumentException();
        }
        if (Strings.isEmpty(description)) {
            throw new IllegalArgumentException();
        }
    }
}
