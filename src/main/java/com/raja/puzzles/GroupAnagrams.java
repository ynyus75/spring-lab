package com.raja.puzzles;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * PATTERN: HashMap with canonical key
 * TRIGGER: "group items that are rearrangements of each other" -> sort each
 *          word's letters into a key; words sharing a key are one family.
 * MNEMONIC: "Sort the word, keep the family."
 *
 * O(n * k log k) time, O(n * k) space (k = word length).
 */
public class GroupAnagrams {

    public static List<List<String>> groupAnagrams(String[] strs) {
        // TODO: implement - group the anagrams together
        return new ArrayList<>();
    }
}
