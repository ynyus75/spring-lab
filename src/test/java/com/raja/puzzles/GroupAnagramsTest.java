package com.raja.puzzles;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * These FAIL until groupAnagrams is implemented - that is the drill.
 * Group order is not significant, so tests compare as sets of sets.
 * Run with: mvn test -Dtest=GroupAnagramsTest
 */
class GroupAnagramsTest {

    /** Order-independent comparison: {"eat","tea"} equals {"tea","eat"}. */
    private static Set<Set<String>> norm(List<List<String>> groups) {
        Set<Set<String>> out = new HashSet<>();
        for (List<String> g : groups) {
            out.add(new HashSet<>(g));
        }
        return out;
    }

    @SafeVarargs
    private static Set<Set<String>> expect(Set<String>... groups) {
        return new HashSet<>(Arrays.asList(groups));
    }

    @SafeVarargs
    private static Set<String> set(String... words) {
        return new HashSet<>(Arrays.asList(words));
    }

    @Test
    @DisplayName("normal: [eat,tea,tan,ate,nat,bat] -> 3 groups")
    void normalCase() {
        assertEquals(
                expect(set("eat", "tea", "ate"), set("tan", "nat"), set("bat")),
                norm(GroupAnagrams.groupAnagrams(
                        new String[]{"eat", "tea", "tan", "ate", "nat", "bat"})));
    }

    @Test
    @DisplayName("empty strings: [\"\",\"\"] -> [[\"\",\"\"]]")
    void emptyStrings() {
        assertEquals(
                expect(set("")),
                norm(GroupAnagrams.groupAnagrams(new String[]{"", ""})));
    }

    @Test
    @DisplayName("single word: [a] -> [[a]]")
    void singleWord() {
        assertEquals(
                expect(set("a")),
                norm(GroupAnagrams.groupAnagrams(new String[]{"a"})));
    }

    @Test
    @DisplayName("no anagrams: [abc,def] -> [[abc],[def]]")
    void noAnagrams() {
        assertEquals(
                expect(set("abc"), set("def")),
                norm(GroupAnagrams.groupAnagrams(new String[]{"abc", "def"})));
    }

    @Test
    @DisplayName("all anagrams: [abc,bca,cab] -> one group")
    void allAnagrams() {
        assertEquals(
                expect(set("abc", "bca", "cab")),
                norm(GroupAnagrams.groupAnagrams(new String[]{"abc", "bca", "cab"})));
    }

    @Test
    @DisplayName("null input -> []")
    void nullInput() {
        assertTrue(GroupAnagrams.groupAnagrams(null).isEmpty());
    }
}
