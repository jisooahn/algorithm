class Solution {
    public int solution(int balls, int share) {
        if (balls == share) {
            return 1;
        }
        long answer = 1;
        for (int i = 0; i < share; i++) {
            answer *= balls - i;
            answer /= i + 1;
        }
        return (int) answer;
    }
}