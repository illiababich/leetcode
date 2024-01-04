package leetcode;

import java.util.HashMap;
import java.util.Map;

public class P2870 {
    public static int minOperations(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        int operations = 0;
        for (int num : count.keySet()) {
            int freq = count.get(num);
            if (freq == 1) {
                return -1;
            } else if (freq % 3 == 0) {
                operations += freq / 3;
            } else if (freq % 3 == 1) {
                if (freq < 4) {
                    return -1;
                } else {
                    operations += (freq - 4) / 3 + 2;
                }
            } else {
                if (freq < 2) {
                    return -1;
                } else {
                    operations += (freq - 2) / 3 + 1;
                }
            }
        }
        return operations;
    }
}
