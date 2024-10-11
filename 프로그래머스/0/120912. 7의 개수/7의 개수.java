class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for (int a : array) {
            String str = Integer.toString(a);
            for (char c : str.toCharArray()) {
                if (c == '7') {
                    answer++;
                }
            }
        }
        return answer;
    }
}