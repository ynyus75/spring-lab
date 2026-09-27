package com.raja.puzzles;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * The old main-harness checks, rewritten as real JUnit 5 tests.
 * These FAIL until maxArea is implemented - that is the drill.
 * Run with: mvn test
 */
class ContainerWithMostWaterTest {

    @Test
    @DisplayName("normal: [1,8,6,2,5,4,8,3,7] -> 49")
    void normalCase() {
        assertEquals(49, ContainerWithMostWater.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }

    @Test
    @DisplayName("two elements: [1,1] -> 1")
    void twoElements() {
        assertEquals(1, ContainerWithMostWater.maxArea(new int[]{1, 1}));
    }

    @Test
    @DisplayName("descending with tall ends: [4,3,2,1,4] -> 16")
    void tallEnds() {
        assertEquals(16, ContainerWithMostWater.maxArea(new int[]{4, 3, 2, 1, 4}));
    }

    @Test
    @DisplayName("single element: [5] -> 0")
    void singleElement() {
        assertEquals(0, ContainerWithMostWater.maxArea(new int[]{5}));
    }

    @Test
    @DisplayName("empty array -> 0")
    void emptyArray() {
        assertEquals(0, ContainerWithMostWater.maxArea(new int[]{}));
    }

    @Test
    @DisplayName("null input -> 0")
    void nullInput() {
        assertEquals(0, ContainerWithMostWater.maxArea(null));
    }
}
