package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class P989 {
    public static List<Integer> addToArrayForm(int[] num, int k) {
        int n = num.length - 1;
        List<Integer> result = new ArrayList<>();

        while (n >= 0 || k > 0) {
            if (n >= 0) {
                k += num[n--];
            }
            result.add(k % 10);
            k /= 10;
        }

        Collections.reverse(result);

        return result;
    }
}
