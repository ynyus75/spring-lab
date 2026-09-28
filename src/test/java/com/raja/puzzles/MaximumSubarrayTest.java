package com.raja.puzzles;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * These FAIL until maxSubArray is implemented - that is the drill.
 * Run with: mvn test -Dtest=MaximumSubarrayTest
 */
class MaximumSubarrayTest {

    @Test
    @DisplayName("normal: [-2,1,-3,4,-1,2,1,-5,4] -> 6")
    void normalCase() {
        assertEquals(6, MaximumSubarray.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }

    @Test
    @DisplayName("all negative: [-3,-2,-1] -> -1")
    void allNegative() {
        assertEquals(-1, MaximumSubarray.maxSubArray(new int[]{-3, -2, -1}));
    }

    @Test
    @DisplayName("all positive: [1,2,3] -> 6")
    void allPositive() {
        assertEquals(6, MaximumSubarray.maxSubArray(new int[]{1, 2, 3}));
    }

    @Test
    @DisplayName("single element: [5] -> 5")
    void singleElement() {
        assertEquals(5, MaximumSubarray.maxSubArray(new int[]{5}));
    }

    @Test
    @DisplayName("zeros: [0,0,0] -> 0")
    void zeros() {
        assertEquals(0, MaximumSubarray.maxSubArray(new int[]{0, 0, 0}));
    }

    @Test
    @DisplayName("null input -> 0")
    void nullInput() {
        assertEquals(0, MaximumSubarray.maxSubArray(null));
    }
}
