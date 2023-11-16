package leetcode;

import java.util.HashMap;
import java.util.Map;

public class P3 {
    public static int lengthOfLongestSubstring(String s) {
        int answer = 0;

        Map<Character, Integer> map = new HashMap<>();
        for (int right_pointer = 0, left_pointer = 0; right_pointer < s.length(); right_pointer++) {
            char symbol = s.charAt(right_pointer);
            if (map.containsKey(symbol) && map.get(symbol) >= left_pointer) {
                left_pointer = map.get(symbol) + 1;
            }
            answer = Math.max(answer, right_pointer - left_pointer + 1);

            map.put(symbol, right_pointer);
        }
        return answer;
    }
}
