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
        if (intervals == null || intervals.length == 0) return new int[0][0];

        Arrays.sort(intervals, (a,b) -> a[0]-b[0]);

        List<int []> merged = new ArrayList<>();
        int [] current = intervals[0];

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= current[1]) {
                current[1] = Math.max(current[1], intervals[i][1]);
            } else {
                merged.add(current);
                current = intervals[i];
            }
        }

        merged.add(current);

        return merged.toArray(new int[0][]);
    }
}
