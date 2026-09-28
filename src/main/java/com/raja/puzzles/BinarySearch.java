package com.raja.puzzles;

/**
 * PATTERN: Binary search (halve the search space)
 * TRIGGER: "sorted array, find x" -> compare the middle; discard the half
 *          that cannot hold x. Invariant: if x is present, it is in [lo, hi].
 * MNEMONIC: "Middle tells you which half to throw away."
 *
 * O(log n) time, O(1) space.
 */
public class BinarySearch {

    public static int binarySearch(int[] nums, int target) {
        // TODO: implement - return the index of target, or -1 if absent
        return -1;
    }
}
