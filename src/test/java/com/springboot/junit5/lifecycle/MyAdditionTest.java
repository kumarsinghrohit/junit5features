package com.springboot.junit5.lifecycle;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.springboot.junit5.Calculator;

public class MyAdditionTest implements LifecycleLoggerWithTestInstance {

    @Test
    @DisplayName("Add Test")
    void addTest() {
        System.out.println("---Inside addTest---");
        assertEquals(11, Calculator.add(5, 6), "6 + 5 will be 11");
    }    
}
