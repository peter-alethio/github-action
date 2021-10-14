package com.example.githubaction.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TodoTest {

    @Test
    void 생성() {
        Todo todo = new Todo("todo");
        assertThat(todo).isEqualTo(new Todo("todo"));
    }
}