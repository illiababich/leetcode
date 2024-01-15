package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P2225 {
    public static List<List<Integer>> findWinners(int[][] matches) {
        HashMap<Integer, int[]> playerStats = new HashMap<>();

        for (int[] match: matches) {
            int winner = match[0];
            int loser = match[1];

            playerStats.putIfAbsent(winner, new int[2]);
            playerStats.get(winner)[0]++;

            playerStats.putIfAbsent(loser, new int[2]);
            playerStats.get(loser)[1]++;
        }

        System.out.println(playerStats);

        List<Integer> flawlessWinners = playerStats.entrySet().stream()
                .filter(entry -> entry.getValue()[1] == 0)
                .map(Map.Entry::getKey)
                .sorted().toList();

        List<Integer> winnersWithOneDefeat = playerStats.entrySet().stream()
                .filter(entry -> entry.getValue()[1] == 1)
                .map(Map.Entry::getKey)
                .sorted().toList();

        List<List<Integer>> categorizedPlayers = new ArrayList<>();
        categorizedPlayers.add(flawlessWinners);
        categorizedPlayers.add(winnersWithOneDefeat);

        return categorizedPlayers;
    }
}
