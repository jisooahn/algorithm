class Solution {
    public int solution(int[] numbers) {
        int answer = (0 + 9) * 10 / 2;
        for (int number : numbers) {
            answer -= number;
        }
        return answer;
    }
}