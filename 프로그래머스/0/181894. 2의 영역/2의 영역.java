class Solution {
    public int[] solution(int[] arr) {
        int firstIdx = -1;
        int lastIdx = -1;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                if (firstIdx == -1) {
                    firstIdx = i;
                } else {
                    lastIdx = i;
                }
            }
        }
        
        if (firstIdx == -1) {
            return new int[]{-1};
        } else if (lastIdx == -1) {
            return new int[]{2};
        }
        
        int[] answer = new int[lastIdx - firstIdx + 1];
        for (int i = firstIdx; i <= lastIdx; i++) {
            answer[i - firstIdx] = arr[i];
        }
        return answer;
    }
}