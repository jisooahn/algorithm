import java.util.Stack;

class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stk = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (stk.isEmpty()) {
                stk.push(arr[i]);
            } else if (stk.peek() != arr[i]) {
                stk.push(arr[i]);
            } else if (stk.peek() == arr[i]) {
                stk.pop();
            }
        }

        if (stk.isEmpty()) {
            return new int[]{-1};
        } else {
            return stk.stream().mapToInt(Integer::intValue).toArray();
        }
    }
}