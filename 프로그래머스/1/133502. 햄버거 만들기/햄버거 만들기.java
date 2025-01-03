import java.util.Stack;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        Stack<Integer> st = new Stack<>();
        for (int i : ingredient) {
            st.push(i);
            
            if (st.size() >= 4 && st.peek() == 1) {
                if (st.get(st.size() - 4) == 1
                    && st.get(st.size() - 3) == 2
                    && st.get(st.size() - 2) == 3) {
                    st.pop();
                    st.pop();
                    st.pop();
                    st.pop();
                    answer++;
                }
            }
        }
        return answer;
    }
}