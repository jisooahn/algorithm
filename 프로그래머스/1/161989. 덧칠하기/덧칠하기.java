class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int paintedSection = 0;
        for (int currentSection : section) {
            if (currentSection > paintedSection) {
                answer++;
                paintedSection = currentSection + m - 1;
            }
        }
        return answer;
    }
}