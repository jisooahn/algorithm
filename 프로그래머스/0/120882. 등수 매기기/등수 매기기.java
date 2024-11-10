import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(int[][] score) {
        double[] averages = new double[score.length];
        for (int i = 0; i < score.length; i++) {
            averages[i] = (double) (score[i][0] + score[i][1]) / 2;
        }
        
        double[] sortedAverages = averages.clone();
        Arrays.sort(sortedAverages);
        
        Map<Double, Integer> map = new HashMap<>();
        int rank = 1;
        for (int i = sortedAverages.length - 1; i >= 0; i--) {
            if (!map.containsKey(sortedAverages[i])) {
                map.put(sortedAverages[i], rank);
            }
            rank++;
        }
        
        int[] answer = new int[score.length];
        for (int i = 0; i < score.length; i++) {
            answer[i] = map.get(averages[i]);
        }
        return answer;
    }
}