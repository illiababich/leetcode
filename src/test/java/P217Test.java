import leetcode.P217;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class P217Test {
    @Test
    public void testContainsDuplicateWithDuplicates() {
        int[] nums = {1, 2, 3, 1};
        assertTrue(P217.containsDuplicate(nums));

        nums = new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        assertTrue(P217.containsDuplicate(nums));
    }

    @Test
    public void testContainsDuplicateWithoutDuplicates() {
        int[] nums = {1, 2, 3, 4};
        assertFalse(P217.containsDuplicate(nums));
    }

    @Test
    public void testContainsDuplicateWithEmptyArray() {
        int[] nums = {};
        assertFalse(P217.containsDuplicate(nums));
    }
}