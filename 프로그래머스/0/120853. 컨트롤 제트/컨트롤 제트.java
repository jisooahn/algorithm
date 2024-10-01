import java.util.Stack;

class Solution {
    public int solution(String s) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        String[] strArray = s.split(" ");
        for (String str : strArray) {
            if ("Z".equals(str)) {
                stack.pop();
            } else {
                stack.push(Integer.parseInt(str));
            }
        }
        while (!stack.isEmpty()) {
            answer += stack.pop();
        }
        return answer;
    }
}