package com.raja.puzzles;

import java.util.HashMap;
import java.util.Map;

/**
 * PATTERN: Prefix Sum + Hash Map
 * TRIGGER: "count subarrays whose sum = K" -> keep a running prefix sum,
 *          and ask: how many earlier prefixes equal (current - K)?
 * MNEMONIC: "K wants a partner: prefix minus K."
 *
 * Counts (does not list) the contiguous subarrays that add up to k.
 * O(n) time, O(n) space.
 */
public class SubarraySumEqualsK {

    public static int countSubarrays(int[] nums, int k) {
        if (nums == null) {
            return 0;
        }

        Map<Integer, Integer> seen = new HashMap<>();
        seen.put(0, 1); // the depot: total before index 0, weighed once
        int runningSum = 0;
        int result = 0;

        for (int num : nums) {
            runningSum += num;
            result += seen.getOrDefault(runningSum - k, 0); // lookup: read-only
            seen.put(runningSum, seen.getOrDefault(runningSum, 0) + 1); // file this total
        }

        return result;
    }
}
