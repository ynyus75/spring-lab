package com.raja.puzzles;

import java.util.HashMap;
import java.util.Map;

/**
 * PATTERN: HashMap (complement lookup)
 * TRIGGER: "two numbers that add up to target" -> walk once; for each x ask
 *          "have I already seen (target - x)?" Remember each value's index.
 * MNEMONIC: "Check before you store - the partner may already be waiting."
 *
 * O(n) time, O(n) space.
 */
public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length < 2) return new int[0];

        Map<Integer, Integer> seen = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int c = target - nums[i];

            if (seen.containsKey(c)) {
               return new int [] {seen.get(c), i};
            } else {
                seen.put(nums[i], i);
            }
        }
        return new int[0];
    }
}
