class Solution {
    public int solution(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 3);
            n /= 3;
        }
        
        int answer = 0;
        int weight = 1;
        for (int i = sb.length() - 1; i >= 0; i--) {
            answer += (sb.charAt(i) - '0') * weight;
            weight *= 3;
        }
        return answer;
    }
}