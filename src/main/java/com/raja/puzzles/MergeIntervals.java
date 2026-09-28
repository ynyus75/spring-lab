package com.raja.puzzles;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * PATTERN: Sort + linear merge
 * TRIGGER: "merge overlapping intervals" -> sort by start; keep one running
 *          interval and stretch its end while the next start <= current end.
 * MNEMONIC: "Sort first, then sweep - overlaps line up on their own."
 *
 * O(n log n) time, O(n) space.
 */
public class MergeIntervals {

    public static int[][] merge(int[][] intervals) {
        // TODO: implement - return the merged non-overlapping intervals
        return new int[0][0];
    }
}
