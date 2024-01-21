import leetcode.P198;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class P198Test {
    private final P198 robber = new P198();

    @Test
    public void testEmptyHouses() {
        assertEquals(0, robber.rob(new int[] {}));
    }

    @Test
    public void testSingleHouse() {
        assertEquals(10, robber.rob(new int[] {10}));
    }

    @Test
    public void testTwoHouses() {
        assertEquals(20, robber.rob(new int[] {10, 20}));
    }

    @Test
    public void testHousesWithAllSameValues() {
        assertEquals(30, robber.rob(new int[] {10, 10, 10, 10, 10}));
    }

    @Test
    public void testLargeNumberOfHouses() {
        int[] houses = new int[100];
        Arrays.fill(houses, 1);
        assertEquals(50, robber.rob(houses));
    }

    @Test
    public void testHousesWithLargeValues() {
        assertEquals(200, robber.rob(new int[] {100, 1, 1, 100, 1}));
    }
}