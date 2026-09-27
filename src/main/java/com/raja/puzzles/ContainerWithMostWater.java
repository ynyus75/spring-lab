package com.raja.puzzles;

/**
 * PATTERN: Two Pointers (converging)
 * TRIGGER: "max area / best pair chosen from both ends" -> put one pointer
 *          at each end; always move the SHORTER side inward.
 * MNEMONIC: "Short side moves - the tall one can't do better by staying."
 *
 * Interview framing: given heights of vertical lines, find the two lines
 * that hold the most water with the x-axis. Area = width * min(h[left], h[right]).
 * O(n) time, O(1) space.
 */
public class ContainerWithMostWater {

    public static int maxArea(int[] height) {
        if (height == null || height.length < 2) return 0;

        int left = 0, right = height.length - 1, best = 0; 

        while (left < right) {
            int w = right - left;
            int area = w * Math.min(height[left], height[right]); 
            best = Math.max(best, area); 

            if (height[left] < height[right]) {
                left++;
            } else if (height[left] > height[right]) {
                right--;
            } else {
                left++;
                right--;
            }
        }

        return best;
    }
}
