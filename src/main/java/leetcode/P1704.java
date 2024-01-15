package leetcode;

import java.util.Set;

public class P1704 {
    public static boolean halvesAreAlike(String s) {
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        int vowelCounter = 0;

        for (int i = 0, j = s.length() / 2; i < s.length() / 2; i++, j++) {
            if (vowels.contains(s.charAt(i))) {
                vowelCounter++;
            }
            if (vowels.contains(s.charAt(j))) {
                vowelCounter--;
            }
        }

        return vowelCounter == 0;
    }
}
