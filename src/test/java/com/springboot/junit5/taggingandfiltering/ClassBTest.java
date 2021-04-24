package com.springboot.junit5.taggingandfiltering;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

public class ClassBTest {
    @Test
    @Tag("development")
    void testCaseB(TestInfo testInfo) {
    }
}
