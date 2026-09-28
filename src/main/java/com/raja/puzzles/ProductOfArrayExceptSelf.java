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
        // TODO: implement - answer[i] = product of all nums except nums[i]
        return new int[0];
    }
}
