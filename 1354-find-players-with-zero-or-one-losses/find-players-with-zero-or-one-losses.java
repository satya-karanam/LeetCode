import java.util.*;

class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {

        Map<Integer, Integer> losses = new HashMap<>();

        for (int[] match : matches) {
            int winner = match[0];
            int loser = match[1];

            if (!losses.containsKey(winner)) {
                losses.put(winner, 0);
            }

            losses.put(loser, losses.getOrDefault(loser, 0) + 1);
        }

        List<Integer> noLoss = new ArrayList<>();
        List<Integer> oneLoss = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : losses.entrySet()) {

            int player = entry.getKey();
            int lossCount = entry.getValue();

            if (lossCount == 0) {
                noLoss.add(player);
            } 
            else if (lossCount == 1) {
                oneLoss.add(player);
            }
        }

        Collections.sort(noLoss);
        Collections.sort(oneLoss);

        List<List<Integer>> answer = new ArrayList<>();

        answer.add(noLoss);
        answer.add(oneLoss);

        return answer;
    }
}