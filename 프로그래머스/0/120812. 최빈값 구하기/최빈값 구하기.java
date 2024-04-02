import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int maxCount = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int a : array) {
            int count = map.getOrDefault(a, 0) + 1;
            map.put(a, count);
            if (count > maxCount) {
                maxCount = count;
                answer = a;
            } else if (count == maxCount) {
                answer = -1;
            }
        }
        return answer;
    }
}