import leetcode.P118;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class P118Test {
    @Test
    public void testGenerateWithFiveRows() {
        List<List<Integer>> expected = Arrays.asList(
                List.of(1),
                Arrays.asList(1, 1),
                Arrays.asList(1, 2, 1),
                Arrays.asList(1, 3, 3, 1),
                Arrays.asList(1, 4, 6, 4, 1)
        );
        assertEquals(expected, P118.generate(5));
    }

    @Test
    public void testGenerateWithThreeRows() {
        List<List<Integer>> expected = Arrays.asList(
                List.of(1),
                Arrays.asList(1, 1),
                Arrays.asList(1, 2, 1)
        );
        assertEquals(expected, P118.generate(3));
    }

    @Test
    public void testGenerateWithOneRow() {
        List<List<Integer>> expected = List.of(
                List.of(1)
        );
        assertEquals(expected, P118.generate(1));
    }
}
