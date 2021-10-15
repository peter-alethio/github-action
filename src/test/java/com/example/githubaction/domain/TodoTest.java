package com.example.githubaction.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

class TodoTest {

    @Test
    void 생성() {
        Todo todo = new Todo("todo","description");
        assertThat(todo).isEqualTo(new Todo("todo", "description"));
    }

    @ParameterizedTest
    @NullAndEmptySource
    void 제목_빈값(String title) {
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> new Todo(title, "description"));
    }

    @ParameterizedTest
    @NullAndEmptySource
    void 설명_빈값(String description) {
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> new Todo("title", description));
    }
}