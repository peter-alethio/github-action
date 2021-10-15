package com.example.githubaction.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

class TodoTest {

    @Test
    void 생성() {
        Todo todo = new Todo("todo");
        assertThat(todo).isEqualTo(new Todo("todo"));
    }

    @ParameterizedTest
    @NullAndEmptySource
    void 제목_빈값(String title) {
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> new Todo(title));
    }
}