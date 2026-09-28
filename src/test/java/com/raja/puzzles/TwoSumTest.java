package com.raja.puzzles;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * These FAIL until twoSum is implemented - that is the drill.
 * Run with: mvn test -Dtest=TwoSumTest
 */
class TwoSumTest {

    @Test
    @DisplayName("normal: [2,7,11,15], 9 -> [0,1]")
    void normalCase() {
        assertArrayEquals(new int[]{0, 1}, TwoSum.twoSum(new int[]{2, 7, 11, 15}, 9));
    }

    @Test
    @DisplayName("pair not at front: [3,2,4], 6 -> [1,2]")
    void pairLater() {
        assertArrayEquals(new int[]{1, 2}, TwoSum.twoSum(new int[]{3, 2, 4}, 6));
    }

    @Test
    @DisplayName("duplicates: [3,3], 6 -> [0,1]")
    void duplicates() {
        assertArrayEquals(new int[]{0, 1}, TwoSum.twoSum(new int[]{3, 3}, 6));
    }

    @Test
    @DisplayName("negatives: [-1,-2,-3,-4], -7 -> [2,3]")
    void negatives() {
        assertArrayEquals(new int[]{2, 3}, TwoSum.twoSum(new int[]{-1, -2, -3, -4}, -7));
    }

    @Test
    @DisplayName("no solution: [1,2,3], 10 -> []")
    void noSolution() {
        assertArrayEquals(new int[0], TwoSum.twoSum(new int[]{1, 2, 3}, 10));
    }

    @Test
    @DisplayName("null input -> []")
    void nullInput() {
        assertArrayEquals(new int[0], TwoSum.twoSum(null, 9));
    }
}
