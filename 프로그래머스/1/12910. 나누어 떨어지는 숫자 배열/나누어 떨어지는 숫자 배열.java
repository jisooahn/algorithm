import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();
        for (int element : arr) {
            if (element % divisor == 0) {
                list.add(element);
            }
        }
        
        if (list.isEmpty()) {
            return new int[]{-1};
        }
    
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        Arrays.sort(answer);
        return answer;
    }
}