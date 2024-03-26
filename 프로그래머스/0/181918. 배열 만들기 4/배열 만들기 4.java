import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; ) {
            if (stack.isEmpty()) {
                stack.push(arr[i++]);
            } else if (stack.peek() < arr[i]) {
                stack.push(arr[i++]);
            } else {
                stack.pop();
            }
        }
        
        int[] stk = new int[stack.size()];
        for (int i = stack.size() - 1; i >= 0; i--) {
            stk[i] = stack.pop();
        }
        return stk;
    }
}