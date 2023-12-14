package leetcode;

public class P74 {
    public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int numCols = matrix[0].length;

        int up = 0, down = matrix.length - 1;

        while (up <= down) {
            int middle = (up + down) / 2;
            if (target > matrix[middle][numCols - 1]) {
                up = middle + 1;
            } else if (target < matrix[middle][0]) {
                down = middle - 1;
            } else {
                // Target is within the range of this row
                break;
            }
        }

        if (up > down) {
            return false; // Target is not within any row range
        }

        int rowIndex = (up + down) / 2;
        int left = 0, right = numCols - 1;
        while (left <= right) {
            int midCol = (left + right) / 2;
            if (matrix[rowIndex][midCol] == target) {
                return true;
            } else if (matrix[rowIndex][midCol] < target) {
                left = midCol + 1;
            } else {
                right = midCol - 1;
            }
        }

        return false;
    }
}
