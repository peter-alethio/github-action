package com.example.githubaction.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TodosTest {

    @Test
    void 생성() {
        Todo 첫번째_할일 = new Todo("제목1", "설명1");
        Todo 두번째_할일 = new Todo("제목2", "설명2");
        Todo 세번째_할일 = new Todo("제목3", "설명3");
        Todos todos = new Todos(첫번째_할일, 두번째_할일, 세번째_할일);
        assertThat(todos.getTodos()).contains(첫번째_할일, 두번째_할일, 세번째_할일);
    }
}