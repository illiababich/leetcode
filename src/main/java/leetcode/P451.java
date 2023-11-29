package leetcode;

import java.util.*;

public class P451 {
    public static String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char iteration = s.charAt(i);
            map.merge(iteration, 1, Integer::sum);
        }

        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        char[] sortedChars = new char[s.length()];

        int k = 0;
        for (Map.Entry<Character, Integer> characterIntegerEntry : list) {
            for (int j = 0; j < characterIntegerEntry.getValue(); j++) {
                sortedChars[k++] = characterIntegerEntry.getKey();
            }
        }

        return String.valueOf(sortedChars);
    }
}
