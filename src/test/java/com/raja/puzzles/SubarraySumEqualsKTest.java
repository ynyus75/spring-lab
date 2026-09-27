package com.raja.puzzles;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * The old main-harness checks, rewritten as real JUnit 5 tests.
 * Run with: mvn test
 */
class SubarraySumEqualsKTest {

    @Test
    @DisplayName("normal: [1,1,1], k=2 -> 2")
    void countsOverlappingPairs() {
        assertEquals(2, SubarraySumEqualsK.countSubarrays(new int[]{1, 1, 1}, 2));
    }

    @Test
    @DisplayName("normal: [1,2,3], k=3 -> 2")
    void countsChunkAndSingleElement() {
        assertEquals(2, SubarraySumEqualsK.countSubarrays(new int[]{1, 2, 3}, 3));
    }

    @Test
    @DisplayName("single element: [5], k=5 -> 1")
    void singleElement() {
        assertEquals(1, SubarraySumEqualsK.countSubarrays(new int[]{5}, 5));
    }

    @Test
    @DisplayName("empty array -> 0")
    void emptyArray() {
        assertEquals(0, SubarraySumEqualsK.countSubarrays(new int[]{}, 5));
    }

    @Test
    @DisplayName("negatives: [-1,-1,1], k=0 -> 1")
    void negativeNumbers() {
        assertEquals(1, SubarraySumEqualsK.countSubarrays(new int[]{-1, -1, 1}, 0));
    }

    @Test
    @DisplayName("null input -> 0")
    void nullInput() {
        assertEquals(0, SubarraySumEqualsK.countSubarrays(null, 1));
    }
}
