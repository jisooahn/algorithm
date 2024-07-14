import java.util.*;

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
        
        return Arrays.copyOfRange(arr, firstIdx, lastIdx + 1);
    }
}