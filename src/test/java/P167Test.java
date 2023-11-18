import leetcode.P167;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class P167Test {
    @Test
    public void test1() {
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        int[] expected = {1, 2};
        assertArrayEquals(expected, P167.twoSum(numbers, target));
    }

    @Test
    public void test2() {
        int[] numbers = {2, 3, 4};
        int target = 6;
        int[] expected = {1, 3};
        assertArrayEquals(expected, P167.twoSum(numbers, target));
    }

    @Test
    public void test3() {
        int[] numbers = {-1, 0};
        int target = -1;
        int[] expected = {1, 2};
        assertArrayEquals(expected, P167.twoSum(numbers, target));
    }

    @Test
    public void test4() {
        int[] numbers = {1, 2, 3, 4, 5};
        int target = 5;
        int[] expected = {1, 4};
        assertArrayEquals(expected, P167.twoSum(numbers, target));
    }

    @Test
    public void test5() {
        int[] numbers = {1, 2, 3, 4, 5};
        int target = 9;
        int[] expected = {4, 5};
        assertArrayEquals(expected, P167.twoSum(numbers, target));
    }

    @Test
    public void test6() {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        int target = 11;
        int[] expected = {5, 6};
        assertArrayEquals(expected, P167.twoSum(numbers, target));
    }

    @Test
    public void test7() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        int target = 13;
        int[] expected = {6, 7};
        assertArrayEquals(expected, P167.twoSum(numbers, target));
    }

    @Test
    public void test8() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
        int target = 15;
        int[] expected = {7, 8};
        assertArrayEquals(expected, P167.twoSum(numbers, target));
    }

    @Test
    public void test9() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 17;
        int[] expected = {8, 9};
        assertArrayEquals(expected, P167.twoSum(numbers, target));
    }

    @Test
    public void test10() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 19;
        int[] expected = {9, 10};
        assertArrayEquals(expected, P167.twoSum(numbers, target));
    }
}
