import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class P1Test {
    @Test
    public void testTwoSumWithPositiveNumbers() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] expected = {0, 1};
        assertArrayEquals(expected, P1.twoSum(nums, target));
    }

    @Test
    public void testTwoSumWithMixedNumbers() {
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] expected = {1, 2};
        assertArrayEquals(expected, P1.twoSum(nums, target));
    }

    @Test
    public void testTwoSumWithDuplicateNumbers() {
        int[] nums = {2, 5, 5, 11};
        int target = 10;
        int[] expected = {1, 2};
        assertArrayEquals(expected, P1.twoSum(nums, target));
    }
}
