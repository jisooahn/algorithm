class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 1;
        int paintedSection = section[0] + m - 1;
        for (int currentSection : section) {
            if (currentSection > paintedSection) {
                answer++;
                paintedSection = currentSection + m - 1;
            }
        }
        return answer;
    }
}