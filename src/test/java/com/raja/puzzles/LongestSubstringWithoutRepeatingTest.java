package com.raja.puzzles;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * The old main-harness checks, rewritten as real JUnit 5 tests.
 * These FAIL until lengthOfLongestSubstring is implemented - that is the drill.
 * Run with: mvn test
 */
class LongestSubstringWithoutRepeatingTest {

    @Test
    @DisplayName("normal: \"abcabcbb\" -> 3")
    void normalCase1() {
        assertEquals(3, LongestSubstringWithoutRepeating.lengthOfLongestSubstring("abcabcbb"));
    }

    @Test
    @DisplayName("normal: \"pwwkew\" -> 3")
    void normalCase2() {
        assertEquals(3, LongestSubstringWithoutRepeating.lengthOfLongestSubstring("pwwkew"));
    }

    @Test
    @DisplayName("all same character: \"bbbbb\" -> 1")
    void allSameCharacter() {
        assertEquals(1, LongestSubstringWithoutRepeating.lengthOfLongestSubstring("bbbbb"));
    }

    @Test
    @DisplayName("single character: \"a\" -> 1")
    void singleCharacter() {
        assertEquals(1, LongestSubstringWithoutRepeating.lengthOfLongestSubstring("a"));
    }

    @Test
    @DisplayName("empty string -> 0")
    void emptyString() {
        assertEquals(0, LongestSubstringWithoutRepeating.lengthOfLongestSubstring(""));
    }

    @Test
    @DisplayName("null input -> 0")
    void nullInput() {
        assertEquals(0, LongestSubstringWithoutRepeating.lengthOfLongestSubstring(null));
    }
}
