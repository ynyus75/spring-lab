package com.raja.puzzles;

import java.util.Set;
import java.util.HashSet;

/**
 * PATTERN: Sliding Window (variable size)
 * TRIGGER: "longest / shortest substring with a constraint" -> grow the
 *          window on the right; when the constraint breaks, shrink from
 *          the left until it holds again.
 * MNEMONIC: "Dupe in, left moves."
 *
 * Interview framing: length of the longest substring with no repeated
 * characters. O(n) time, O(min(n, alphabet)) space.
 */
public class LongestSubstringWithoutRepeating {

    public static int lengthOfLongestSubstring(String s) {

	    if (s == null) return 0;

	    int left = 0, length = 0, best = 0; 
	    Set<Character> set = new HashSet<>();

	    for (int right = left; right < s.length(); right++) {
		    char c = s.charAt(right);
		    while(set.contains(c)) {
			    set.remove(s.charAt(left));
			    left++;
		    }
		    set.add(c);
		    length++;
		    best = Math.max(best, right-left+1);
	    }
        return best;
    }
}
