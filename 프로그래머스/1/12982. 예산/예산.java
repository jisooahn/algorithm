import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        for (int departmentBudget : d) {
            if (budget - departmentBudget < 0) {
                break;
            }
            budget -= departmentBudget;
            answer++;
        }
        return answer;
    }
}