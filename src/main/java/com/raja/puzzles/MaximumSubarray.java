package com.raja.puzzles;

/**
 * PATTERN: Kadane's (greedy running sum)
 * TRIGGER: "maximum contiguous sum" -> at each x, either extend the running
 *          sum or restart at x, whichever is bigger. Track the best seen.
 * MNEMONIC: "Extend or restart - never carry a losing sum."
 *
 * O(n) time, O(1) space.
 */
public class MaximumSubarray {

    public static int maxSubArray(int[] nums) {
        // TODO: implement - return the largest sum of any contiguous subarray
        return 0;
    }
}
