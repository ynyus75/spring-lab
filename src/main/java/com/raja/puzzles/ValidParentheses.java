package com.raja.puzzles;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * PATTERN: Stack (LIFO matching)
 * TRIGGER: "correctly nested / closed brackets" -> push every opener;
 *          on a closer, the stack top must be its matching opener.
 * MNEMONIC: "Last opened, first closed - the stack never lies."
 *
 * O(n) time, O(n) space.
 */
public class ValidParentheses {

    public static boolean isValid(String s) {
        // TODO: implement - return true only if every bracket closes correctly
        return false;
    }
}
