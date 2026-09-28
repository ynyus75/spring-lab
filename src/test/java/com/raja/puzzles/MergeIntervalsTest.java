package com.raja.puzzles;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * These FAIL until merge is implemented - that is the drill.
 * Run with: mvn test -Dtest=MergeIntervalsTest
 */
class MergeIntervalsTest {

    @Test
    @DisplayName("normal: [[1,3],[2,6],[8,10],[15,18]] -> [[1,6],[8,10],[15,18]]")
    void normalCase() {
        assertArrayEquals(
                new int[][]{{1, 6}, {8, 10}, {15, 18}},
                MergeIntervals.merge(new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}}));
    }

    @Test
    @DisplayName("touching ends: [[1,4],[4,5]] -> [[1,5]]")
    void touchingEnds() {
        assertArrayEquals(
                new int[][]{{1, 5}},
                MergeIntervals.merge(new int[][]{{1, 4}, {4, 5}}));
    }

    @Test
    @DisplayName("unsorted input: [[4,6],[1,3]] -> [[1,3],[4,6]]")
    void unsortedInput() {
        assertArrayEquals(
                new int[][]{{1, 3}, {4, 6}},
                MergeIntervals.merge(new int[][]{{4, 6}, {1, 3}}));
    }

    @Test
    @DisplayName("single interval: [[1,2]] -> [[1,2]]")
    void singleInterval() {
        assertArrayEquals(
                new int[][]{{1, 2}},
                MergeIntervals.merge(new int[][]{{1, 2}}));
    }

    @Test
    @DisplayName("empty input -> []")
    void emptyInput() {
        assertArrayEquals(new int[0][0], MergeIntervals.merge(new int[0][0]));
    }

    @Test
    @DisplayName("null input -> []")
    void nullInput() {
        assertArrayEquals(new int[0][0], MergeIntervals.merge(null));
    }
}
