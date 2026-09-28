package com.raja.puzzles;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * These FAIL until binarySearch is implemented - that is the drill.
 * Run with: mvn test -Dtest=BinarySearchTest
 */
class BinarySearchTest {

    @Test
    @DisplayName("found: [-1,0,3,5,9,12], 9 -> 4")
    void found() {
        assertEquals(4, BinarySearch.binarySearch(new int[]{-1, 0, 3, 5, 9, 12}, 9));
    }

    @Test
    @DisplayName("not found: [-1,0,3,5,9,12], 2 -> -1")
    void notFound() {
        assertEquals(-1, BinarySearch.binarySearch(new int[]{-1, 0, 3, 5, 9, 12}, 2));
    }

    @Test
    @DisplayName("first element: [1,2,3,4], 1 -> 0")
    void firstElement() {
        assertEquals(0, BinarySearch.binarySearch(new int[]{1, 2, 3, 4}, 1));
    }

    @Test
    @DisplayName("last element: [1,2,3,4], 4 -> 3")
    void lastElement() {
        assertEquals(3, BinarySearch.binarySearch(new int[]{1, 2, 3, 4}, 4));
    }

    @Test
    @DisplayName("single element found: [5], 5 -> 0")
    void singleFound() {
        assertEquals(0, BinarySearch.binarySearch(new int[]{5}, 5));
    }

    @Test
    @DisplayName("single element missing: [5], 3 -> -1")
    void singleMissing() {
        assertEquals(-1, BinarySearch.binarySearch(new int[]{5}, 3));
    }

    @Test
    @DisplayName("empty array -> -1")
    void emptyArray() {
        assertEquals(-1, BinarySearch.binarySearch(new int[0], 1));
    }

    @Test
    @DisplayName("null input -> -1")
    void nullInput() {
        assertEquals(-1, BinarySearch.binarySearch(null, 1));
    }
}
