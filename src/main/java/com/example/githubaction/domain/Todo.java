package com.example.githubaction.domain;

import lombok.EqualsAndHashCode;
import org.apache.logging.log4j.util.Strings;

@EqualsAndHashCode
public class Todo {

    private final String title;

    public Todo(String title) {
        checkTitle(title);
        this.title = title;
    }

    private void checkTitle(String title) {
        if (Strings.isEmpty(title)) {
            throw new IllegalArgumentException();
        }
    }
}
