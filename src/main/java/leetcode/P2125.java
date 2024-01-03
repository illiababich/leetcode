package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P2125 {
    public static int numberOfBeams(String[] bank) {
        int[] counts = Arrays.stream(bank)
                .parallel()
                .mapToInt(row -> (int) row.chars().filter(ch -> ch == '1').count())
                .filter(count -> count > 0)
                .toArray();

        int result = 0;

        for (int i = 0; i < counts.length - 1; i++) {
            result += counts[i] * counts[i + 1];
        }

        return result;
    }
}
