class Solution {
    public int solution(int[] array, int n) {
        int answer = array[0];
        int minDiff = Math.abs(array[0] - n);
        
        for (int a : array) {
            int currDiff = Math.abs(a - n);
            if (minDiff > currDiff || (minDiff == currDiff && answer > a)) {
                minDiff = currDiff;
                answer = a;
            }
        }
        return answer;
    }
}