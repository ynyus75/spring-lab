package com.raja.puzzles;

/**
 * PATTERN: Prefix/suffix passes
 * TRIGGER: "product of everything except self, no division" -> one pass
 *          left-to-right builds left products, one pass right-to-left
 *          multiplies in the right products.
 * MNEMONIC: "Left hand, right hand - multiply what each side saw."
 *
 * O(n) time, O(1) extra space (output array not counted).
 */
public class ProductOfArrayExceptSelf {

    public static int[] productExceptSelf(int[] nums) {
        if (nums == null || nums.length == 0) return new int[0];

        int n = nums.length;
        int [] result = new int[n];

        result[0] = 1; 

        for (int i = 1; i < n; i++) {
            result[i] = result[i-1] * nums[i-1];
        }

        int right = 1;
        for (int i = n-1; i >= 0; i--) {
            result[i] *= right;
            right *= nums[i];
        }

        return result;
    }
}
