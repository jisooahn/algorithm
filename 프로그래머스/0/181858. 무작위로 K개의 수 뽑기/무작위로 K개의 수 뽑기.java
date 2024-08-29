import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        Set<Integer> set = new LinkedHashSet<>();
        for (int a : arr) {
            set.add(a);
            if (set.size() == k) {
                break;
            }
        }
        int idx = 0;
        for (int num : set) {
            answer[idx++] = num;
        }
        while (idx < k) {
            answer[idx++] = -1;
        }
        return answer;
    }
}