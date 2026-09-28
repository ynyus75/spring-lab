package com.raja.puzzles;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * These FAIL until isValid is implemented - that is the drill.
 * Run with: mvn test -Dtest=ValidParenthesesTest
 */
class ValidParenthesesTest {

    @Test
    @DisplayName("simple pair: \"()\" -> true")
    void simplePair() {
        assertTrue(ValidParentheses.isValid("()"));
    }

    @Test
    @DisplayName("mixed types: \"()[]{}\" -> true")
    void mixedTypes() {
        assertTrue(ValidParentheses.isValid("()[]{}"));
    }

    @Test
    @DisplayName("wrong closer: \"(]\" -> false")
    void wrongCloser() {
        assertFalse(ValidParentheses.isValid("(]"));
    }

    @Test
    @DisplayName("interleaved: \"([)]\" -> false")
    void interleaved() {
        assertFalse(ValidParentheses.isValid("([)]"));
    }

    @Test
    @DisplayName("nested: \"{[]}\" -> true")
    void nested() {
        assertTrue(ValidParentheses.isValid("{[]}"));
    }

    @Test
    @DisplayName("unclosed opener: \"((\" -> false")
    void unclosed() {
        assertFalse(ValidParentheses.isValid("(("));
    }

    @Test
    @DisplayName("empty string -> true")
    void emptyString() {
        assertTrue(ValidParentheses.isValid(""));
    }

    @Test
    @DisplayName("null input -> false")
    void nullInput() {
        assertFalse(ValidParentheses.isValid(null));
    }
}
