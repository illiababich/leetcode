package leetcode;

import java.util.Arrays;

public class P1657 {
    public static boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }

        int[] occurrenceArray1 = new int[26];
        int[] occurrenceArray2 = new int[26];

        for (int i = 0; i < word1.length(); i++) {
            occurrenceArray1[word1.charAt(i) - 'a']++;
            occurrenceArray2[word2.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if ((occurrenceArray1[i] == 0 && occurrenceArray2[i] != 0) || (occurrenceArray1[i] != 0 && occurrenceArray2[i] == 0)) {
                return false;
            }
        }

        Arrays.sort(occurrenceArray1);
        Arrays.sort(occurrenceArray2);

        return Arrays.equals(occurrenceArray1, occurrenceArray2);
    }
}
