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
        return stk.isEmpty() ? new int[]{-1} : stk.stream().mapToInt(Integer::intValue).toArray();
    }
}