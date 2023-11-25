package leetcode;

import java.util.HashMap;

public class P242 {
    public static boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char iteration = s.charAt(i);
            map1.merge(iteration, 1, Integer::sum);
        }

        HashMap<Character, Integer> map2 = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            char iteration = t.charAt(i);
            map2.merge(iteration, 1, Integer::sum);
        }
        return map1.equals(map2);
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("qwerttyy", "qwerttyy"));
    }
}
