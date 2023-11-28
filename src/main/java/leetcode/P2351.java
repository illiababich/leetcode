package leetcode;

import java.util.HashSet;
import java.util.Set;

public class P2351 {
    public static char repeatedCharacter(String s) {
        Set<Character> set = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char iteration = s.charAt(i);
            if (!set.add(iteration)) {
                return iteration;
            }
        }

        return 'a';
    }
}
