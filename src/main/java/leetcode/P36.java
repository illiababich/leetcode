package leetcode;

import java.util.HashSet;
import java.util.Set;

public class P36 {
    public static boolean isValidSudoku(char[][] board) {
        Set<Character> horizontalSet = new HashSet<>();

        Set<Character> verticalSet = new HashSet<>();

        Set<Character> cubeSet1 = new HashSet<>();
        Set<Character> cubeSet2 = new HashSet<>();
        Set<Character> cubeSet3 = new HashSet<>();

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                char iteration = board[j][i];
                if (iteration != '.' && !verticalSet.add(iteration)) return false;
                if (iteration != '.' && j < 3 && !cubeSet1.add(iteration)) return false;
                if (iteration != '.' && j > 2 && j < 6 && !cubeSet2.add(iteration)) return false;
                if (iteration != '.' && j > 5 && j < 9 && !cubeSet3.add(iteration)) return false;

                char horizontalIteration = board[i][j];
                if (horizontalIteration != '.' && !horizontalSet.add(horizontalIteration)) return false;
            }
            horizontalSet.clear();
            verticalSet.clear();

            if (i % 3 == 2) {
                cubeSet1.clear();
                cubeSet2.clear();
                cubeSet3.clear();
            }
        }

        return true;
    }
}
