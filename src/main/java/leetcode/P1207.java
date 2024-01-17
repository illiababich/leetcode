package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class P1207 {
    public static boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> occurrenceMap = new HashMap<>();
        for(int element: arr) {
            occurrenceMap.merge(element, 1, Integer::sum);
        }
        Set<Integer> valueSet = new HashSet<>(occurrenceMap.values());
        return valueSet.size() == occurrenceMap.size();
    }
}
