package com.test.demo.hello;

import com.sun.tracing.dtrace.ModuleName;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.bind.Name;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class HelloControllerTest {

    @Autowired
    private HelloController helloController;

    @DisplayName("1. Hello 가 오는지 정삭적으로 오는 경우")
    @Test
    void hello() {
        assertThat(helloController.hello()).isEqualTo("Hello");
    }

    @DisplayName("2. Hello 가 오는지 정삭적으로 오지 않은 경우")
    @Test
    void invalidateHello() {
        assertThat(helloController.hello()).isNotEqualTo("Hello1");
    }
}