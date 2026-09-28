package com.raja.puzzles;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * These FAIL until climbStairs is implemented - that is the drill.
 * Run with: mvn test -Dtest=ClimbingStairsTest
 */
class ClimbingStairsTest {

    @Test
    @DisplayName("n=1 -> 1")
    void oneStep() {
        assertEquals(1, ClimbingStairs.climbStairs(1));
    }

    @Test
    @DisplayName("n=2 -> 2")
    void twoSteps() {
        assertEquals(2, ClimbingStairs.climbStairs(2));
    }

    @Test
    @DisplayName("n=3 -> 3")
    void threeSteps() {
        assertEquals(3, ClimbingStairs.climbStairs(3));
    }

    @Test
    @DisplayName("n=5 -> 8")
    void fiveSteps() {
        assertEquals(8, ClimbingStairs.climbStairs(5));
    }

    @Test
    @DisplayName("n=10 -> 89")
    void tenSteps() {
        assertEquals(89, ClimbingStairs.climbStairs(10));
    }

    @Test
    @DisplayName("n=0 -> 0")
    void zeroSteps() {
        assertEquals(0, ClimbingStairs.climbStairs(0));
    }
}
