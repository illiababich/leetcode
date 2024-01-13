package leetcode;

import java.util.HashMap;
import java.util.Map;

public class P1347 {
    public static int minSteps(String s, String t) {
        if (s.length() != t.length()) {
            return -1;
        }

        int stepCount = 0;
        Map<Character, Integer> occurrenceMap = new HashMap<>();

        for (char ch : s.toCharArray()) {
            occurrenceMap.merge(ch, 1, Integer::sum);
        }

        for (char ch : t.toCharArray()) {
            occurrenceMap.merge(ch, -1, Integer::sum);
        }

        for (int count : occurrenceMap.values()) {
            if (count > 0) {
                stepCount += count;
            }
        }

        return stepCount;
    }
}
