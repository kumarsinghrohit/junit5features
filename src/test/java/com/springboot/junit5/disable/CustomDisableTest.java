package com.springboot.junit5.disable;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.springboot.junit5.Calculator;

public class CustomDisableTest {
    @Tag("DEV")
    @Test
    void testOne() {
        System.out.println("======TEST ONE EXECUTED=======");
        assertEquals(4, Calculator.add(2, 2));
    }

    @Tag("PROD")
    @Test
    void testTwo() {
        System.out.println("======TEST TWO EXECUTED=======");
        assertEquals(6, Calculator.add(2, 4));
    }
}
