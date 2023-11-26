import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import leetcode.P49;

import java.util.Arrays;
import java.util.List;

public class P49Test {
    @Test
    void testGroupAnagrams1() {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = P49.groupAnagrams(strs);
        assertTrue(result.contains(List.of("bat")));
        assertTrue(result.contains(Arrays.asList("tan", "nat")));
        assertTrue(result.contains(Arrays.asList("eat", "tea", "ate")));
    }

    @Test
    void testGroupAnagrams2() {
        String[] strs = {""};
        List<List<String>> result = P49.groupAnagrams(strs);
        assertTrue(result.contains(List.of("")));
    }

    @Test
    void testGroupAnagrams3() {
        String[] strs = {"a"};
        List<List<String>> result = P49.groupAnagrams(strs);
        assertTrue(result.contains(List.of("a")));
    }

    @Test
    void testGroupAnagramsWithEmptyInput() {
        String[] strs = {};
        List<List<String>> result = P49.groupAnagrams(strs);
        assertTrue(result.isEmpty());
    }

    @Test
    void testGroupAnagramsWithMultipleEmptyStrings() {
        String[] strs = {"", "", ""};
        List<List<String>> result = P49.groupAnagrams(strs);
        assertTrue(result.contains(Arrays.asList("", "", "")));
    }

    @Test
    void testGroupAnagramsWithIdenticalStrings() {
        String[] strs = {"abc", "abc", "abc"};
        List<List<String>> result = P49.groupAnagrams(strs);
        assertTrue(result.contains(Arrays.asList("abc", "abc", "abc")));
    }

    @Test
    void testGroupAnagramsWithNoAnagrams() {
        String[] strs = {"abc", "def", "ghi"};
        List<List<String>> result = P49.groupAnagrams(strs);
        assertTrue(result.contains(List.of("abc")));
        assertTrue(result.contains(List.of("def")));
        assertTrue(result.contains(List.of("ghi")));
    }
}
