package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P2610 {
    public static List<List<Integer>> findMatrix(int[] nums) {
        Map<Integer, Integer> rowMap = new HashMap<>();
        List<List<Integer>> result = new ArrayList<>();

        for (int num : nums) {
            int count = rowMap.getOrDefault(num, 0);
            rowMap.put(num, count + 1);

            while (result.size() <= count) {
                result.add(new ArrayList<>());
            }

            result.get(count).add(num);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] input = {1, 3, 4, 1, 2, 3, 1};
        System.out.println(findMatrix(input));
    }
}
