import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        int firstIdx = 0;
        int lastIdx = arr.length;
        for (int i = 0; i < query.length; i++) {
            if (i % 2 == 0) {
                lastIdx = firstIdx + query[i];
            } else {
                firstIdx = firstIdx + query[i];
            }
        }
        
        int[] answer = new int[lastIdx - firstIdx + 1];
        for (int i = firstIdx; i <= lastIdx; i++) {
            answer[i - firstIdx] = arr[i];
        }
        return answer;
    }
}