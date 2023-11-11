import java.util.ArrayList;
import java.util.List;

public class P119 {
    public static List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>();
        long previous = 1;
        result.add((int) previous);

        for (int i = 1; i < rowIndex + 1; i++) {
            long current = (previous * (rowIndex - i + 1)) / i;
            result.add((int) current);
            previous = current;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(getRow(3));
    }
}
