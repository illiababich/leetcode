public class P200 {
    public static int numIslands(char[][] grid) {
        int numberOfIslands = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                char element = grid[i][j];
                if (element == '1') {
                    grid = destroyIsland(grid, i, j);
                    numberOfIslands++;
                }
            }
        }

        return numberOfIslands;
    }

    public static char[][] destroyIsland(char[][] array, int xAxis, int yAxis) {
        if (xAxis - 1 >= 0) {
            if (array[xAxis - 1][yAxis] == '1') {
                array[xAxis - 1][yAxis] = 0;
                destroyIsland(array, xAxis - 1, yAxis);
            }
        }

        if (yAxis - 1 >= 0) {
            if (array[xAxis][yAxis - 1] == '1') {
                array[xAxis][yAxis - 1] = 0;
                destroyIsland(array, xAxis, yAxis - 1);
            }
        }

        if (yAxis + 1 < array[0].length) {
            if (array[xAxis][yAxis + 1] == '1') {
                array[xAxis][yAxis + 1] = 0;
                destroyIsland(array, xAxis, yAxis + 1);
            }
        }

        if (xAxis + 1 < array.length) {
            if (array[xAxis + 1][yAxis] == '1') {
                array[xAxis + 1][yAxis] = 0;
                destroyIsland(array, xAxis + 1, yAxis);
            }
        }

        return array;
    }

    public static void main(String[] args) {
        char[][] grid1 = {
                {'1', '1', '1'},
                {'0', '1', '0'},
                {'1', '1', '1'}
        };
        char[][] grid2 = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };

        System.out.println(numIslands(grid1));
        System.out.println(numIslands(grid2));
    }
}
