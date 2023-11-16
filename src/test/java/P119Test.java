import leetcode.P119;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class P119Test {
    @Test
    public void testGenerateWithRowIndexThree() {
        List<Integer> expected = Arrays.asList(1, 3, 3, 1);
        assertEquals(expected, P119.getRow(3));
    }

    @Test
    public void testGenerateWithRowIndexZero() {
        List<Integer> expected = List.of(1);
        assertEquals(expected, P119.getRow(0));
    }

    @Test
    public void testGenerateWithRowIndexOne() {
        List<Integer> expected = Arrays.asList(1, 1);
        assertEquals(expected, P119.getRow(1));
    }
}
