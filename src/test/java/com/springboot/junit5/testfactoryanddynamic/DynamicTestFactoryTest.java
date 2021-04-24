package com.springboot.junit5.testfactoryanddynamic;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import com.springboot.junit5.MathUtil;

@RunWith(JUnitPlatform.class)
public class DynamicTestFactoryTest {

    // Static test 1
    @Test
    void test_Add() {
        assertEquals(5, MathUtil.add(3, 2));
    }

    // This method produces Dynamic test cases
    @TestFactory
    List<DynamicTest> dynamicTestsFromCollection() {

        return Arrays.asList(
                dynamicTest("1st dynamic test", () -> assertTrue(MathUtil.isPrime(13))),
                dynamicTest("2nd dynamic test", () -> assertEquals(5, MathUtil.devide(25, 5))));
    }

    // Static test 2
    @Test
    void test_Devide() {
        assertEquals(5, MathUtil.devide(25, 5));
    }

}
