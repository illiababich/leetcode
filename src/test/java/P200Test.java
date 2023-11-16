import leetcode.P200;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class P200Test {
    @Test
    public void testNumIslandsWithMultipleIslands() {
        char[][] grid = {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };
        assertEquals(1, P200.numIslands(grid));
    }

    @Test
    public void testNumIslandsWithSingleIsland() {
        char[][] grid = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };
        assertEquals(3, P200.numIslands(grid));
    }

    @Test
    public void testNumIslandsWithNoIslands() {
        char[][] grid = {
                {'0', '0', '0', '0', '0'},
                {'0', '0', '0', '0', '0'},
                {'0', '0', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };
        assertEquals(0, P200.numIslands(grid));
    }
}
