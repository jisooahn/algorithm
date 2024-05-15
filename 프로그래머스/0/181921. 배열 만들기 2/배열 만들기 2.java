import java.util.Stack;

class Solution {
    public int[] solution(int l, int r) {
        Stack<Integer> stk = new Stack<>();
        for (int i = l; i <= r; i++) {
            String tmp = Integer.toString(i);
            stk.push(i);
            for (char c : tmp.toCharArray()) {
                if (!(c == '0' || c == '5')) {
                    stk.pop();
                    break;
                }
            }
        }

        if (stk.isEmpty()) {
            return new int[]{-1};
        } else {
            return stk.stream().mapToInt(Integer::intValue).toArray();
        }
    }
}