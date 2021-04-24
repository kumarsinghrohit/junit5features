package com.springboot.junit5.assertions;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.Optional;
import java.util.function.BooleanSupplier;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.springboot.junit5.Calculator;

public class AssertionsTest {

    @BeforeAll
    static void setup() {
        System.out.println("@BeforeAll executed");
    }

    @BeforeEach
    void setupThis() {
        System.out.println("@BeforeEach executed");
    }

    @Test
    void testOne() {
        System.out.println("======TEST ONE EXECUTED=======");
        assertEquals(4, Calculator.add(2, 2));
    }

    @Test
    public void whenAssertingArraysEquality_thenEqual() {
        System.out.println("======TEST whenAssertingArraysEquality_thenEqual EXECUTED=======");
        char[] expected = { 'J', 'u', 'p', 'i', 't', 'e', 'r' };
        char[] actual = "Jupiter".toCharArray();
        assertArrayEquals(expected, actual, "Arrays should be equal");
    }

    @Test
    public void whenAssertingConditions_thenVerified() {
        System.out.println("======TEST whenAssertingConditions_thenVerified EXECUTED=======");
        assertTrue(5 > 4, "5 is greater the 4");
        assertTrue(null == null, "null is equal to null");
    }

    @Test
    public void givenBooleanSupplier_whenAssertingCondition_thenVerified() {
        System.out.println("======TEST givenBooleanSupplier_whenAssertingCondition_thenVerified EXECUTED=======");
        BooleanSupplier condition = () -> 5 > 6;
        assertFalse(condition, "5 is not greater then 6");
    }

    @Test
    public void whenAssertingNotNull_thenTrue() {
        System.out.println("======TEST whenAssertingNotNull_thenTrue EXECUTED=======");
        Object dog = new Object();
        assertNotNull(dog, () -> "The dog should not be null");
    }

    @Test
    public void whenAssertingNull_thenTrue() {
        System.out.println("======TEST whenAssertingNull_thenTrue EXECUTED=======");
        Object cat = null;
        assertNull(cat, () -> "The cat should be null");
    }

    @Test
    public void whenAssertingSameObject_thenSuccessfull() {
        System.out.println("======TEST whenAssertingSameObject_thenSuccessfull EXECUTED=======");
        String language = "Java";
        Optional<String> optional = Optional.of(language);

        assertSame(language, optional.get());
    }

    @Test
    public void whenFailingATest_thenFailed() {
        System.out.println("======TEST whenFailingATest_thenFailed EXECUTED=======");
        // Test not completed
        // The fail assertion fails a test with the provided failure message as well as
        // the underlying cause.
        // This can be useful to mark a test when it's development it's not completed:
        fail("FAIL - test not completed");
    }

    @Test
    public void givenMultipleAssertion_whenAssertingAll_thenOK() {
        System.out.println("======TEST givenMultipleAssertion_whenAssertingAll_thenOK EXECUTED=======");
        assertAll(
                "heading",
                () -> assertEquals(4, 2 * 2, "4 is 2 times 2"),
                () -> assertEquals("java", "JAVA".toLowerCase()));
    }

    @Test
    void whenAssertingException_thenThrown() {
        System.out.println("======TEST whenAssertingException_thenThrown EXECUTED=======");
        Throwable exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    throw new IllegalArgumentException("Exception message");
                });
        assertEquals("Exception message", exception.getMessage());
    }

    @AfterEach
    void tearThis() {
        System.out.println("@AfterEach executed");
    }

    @AfterAll
    static void tear() {
        System.out.println("@AfterAll executed");
    }
}
