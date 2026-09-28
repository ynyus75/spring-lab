package com.raja.puzzles;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * These FAIL until productExceptSelf is implemented - that is the drill.
 * Run with: mvn test -Dtest=ProductOfArrayExceptSelfTest
 */
class ProductOfArrayExceptSelfTest {

    @Test
    @DisplayName("normal: [1,2,3,4] -> [24,12,8,6]")
    void normalCase() {
        assertArrayEquals(new int[]{24, 12, 8, 6},
                ProductOfArrayExceptSelf.productExceptSelf(new int[]{1, 2, 3, 4}));
    }

    @Test
    @DisplayName("with zero: [1,0,3] -> [0,3,0]")
    void withZero() {
        assertArrayEquals(new int[]{0, 3, 0},
                ProductOfArrayExceptSelf.productExceptSelf(new int[]{1, 0, 3}));
    }

    @Test
    @DisplayName("two elements: [2,3] -> [3,2]")
    void twoElements() {
        assertArrayEquals(new int[]{3, 2},
                ProductOfArrayExceptSelf.productExceptSelf(new int[]{2, 3}));
    }

    @Test
    @DisplayName("negatives: [-1,2,-3] -> [-6,3,-2]")
    void negatives() {
        assertArrayEquals(new int[]{-6, 3, -2},
                ProductOfArrayExceptSelf.productExceptSelf(new int[]{-1, 2, -3}));
    }

    @Test
    @DisplayName("single element: [7] -> [1]")
    void singleElement() {
        assertArrayEquals(new int[]{1},
                ProductOfArrayExceptSelf.productExceptSelf(new int[]{7}));
    }

    @Test
    @DisplayName("null input -> []")
    void nullInput() {
        assertArrayEquals(new int[0],
                ProductOfArrayExceptSelf.productExceptSelf(null));
    }
}
