import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import leetcode.P989;

import java.util.Arrays;
import java.util.List;

public class P989Test {
    @Test
    public void testWithSmallNumbers() {
        assertEquals(Arrays.asList(1, 2, 4), P989.addToArrayForm(new int[]{1, 2, 3}, 1));
    }

    @Test
    public void testWithKAsZero() {
        assertEquals(Arrays.asList(1, 2, 3), P989.addToArrayForm(new int[]{1, 2, 3}, 0));
    }

    @Test
    public void testWithAAsEmptyArray() {
        assertEquals(List.of(5), P989.addToArrayForm(new int[]{}, 5));
    }

    @Test
    public void testWithLargeK() {
        assertEquals(Arrays.asList(1, 0, 0, 0), P989.addToArrayForm(new int[]{9, 9, 9}, 1));
    }

    @Test
    public void testWithCarryOver() {
        assertEquals(Arrays.asList(1, 0, 1, 7), P989.addToArrayForm(new int[]{9, 9, 9}, 18));
    }

    @Test
    public void testWithAllNinesInA() {
        assertEquals(Arrays.asList(1, 0, 0, 0, 0), P989.addToArrayForm(new int[]{9, 9, 9, 9}, 1));
    }

    @Test
    public void testWithBothAAndKLarge() {
        assertEquals(Arrays.asList(1, 0, 0, 1), P989.addToArrayForm(new int[]{9, 9, 9}, 2));
    }
}
