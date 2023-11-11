import java.util.ArrayList;
import java.util.List;

public class P118 {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        if (numRows == 0) {
            return result;
        }

        List<Integer> sublist1 = new ArrayList<Integer>();
        sublist1.add(1);
        result.add(sublist1);

        if (numRows == 1) {
            return result;
        }

        for (int i = 1; i < numRows; i++) {
            List<Integer> iteration = new ArrayList<Integer>();

            iteration.add(1);
            for (int j = 1; j < result.get(i - 1).size(); j++) {
                iteration.add(result.get(i - 1).get(j - 1) + result.get(i - 1).get(j));
            }
            iteration.add(1);

            result.add(iteration);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(generate(5));
    }
}
