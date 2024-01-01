package leetcode;

import java.util.Arrays;

public class P455 {
    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int childIndex = 0, cookieIndex = 0;

        while (childIndex < g.length && cookieIndex < s.length) {
            if (g[childIndex] <= s[cookieIndex]) {
                childIndex++;
            }
            cookieIndex++;
        }

        return childIndex;
    }
}
