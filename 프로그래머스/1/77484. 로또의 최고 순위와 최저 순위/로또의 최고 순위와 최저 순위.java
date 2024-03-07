import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : win_nums) {
            set.add(num);
        }
        int count = 0, zeroCount = 0;
        for (int num : lottos) {
            if (num == 0) {
                zeroCount++;
            } else if (set.contains(num)) {
                count++;
            }
        }
        int[] rank = {6, 6, 5, 4, 3, 2, 1};
        return new int[]{rank[count + zeroCount], rank[count]};
    }
}