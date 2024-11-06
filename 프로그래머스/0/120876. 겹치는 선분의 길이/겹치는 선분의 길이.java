import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int[][] lines) {
        Set<Integer> points = new HashSet<>();
        
        for (int i = 0; i < lines.length - 1; i++) {
            for (int j = i + 1; j < lines.length; j++) {
                int start = Math.max(lines[i][0], lines[j][0]);
                int end = Math.min(lines[i][1], lines[j][1]);
                if (end > start) {
                    for (int k = start; k < end; k++) {
                        points.add(k);
                    }
                }
            }
        }
        return points.size();
    }
}