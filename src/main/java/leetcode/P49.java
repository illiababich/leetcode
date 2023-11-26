package leetcode;

import java.util.*;

public class P49 {
    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();

        for (String iteration : strs) {
            char[] chars = iteration.toCharArray();
            Arrays.sort(chars);
            String sortedIteration = new String(chars);

            if (map.containsKey(sortedIteration)) {
                map.get(sortedIteration).add(iteration);
            } else {
                ArrayList<String> arrayList = new ArrayList<>();
                arrayList.add(iteration);
                map.put(sortedIteration, arrayList);
            }
        }

        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            result.add(entry.getValue());
        }

        return result;
    }
}
