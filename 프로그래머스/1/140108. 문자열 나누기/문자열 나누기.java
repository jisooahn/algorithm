class Solution {
    public int solution(String s) {
        int answer = 0;
        int index = 0;
        
        while (index < s.length()) {
            char x = s.charAt(index);
            int sameCount = 0;
            int diffCount = 0;
            
            while (index < s.length()) {
                char c = s.charAt(index++);
                if (x == c) {
                    sameCount++;
                } else {
                    diffCount++;
                }
                if (sameCount == diffCount) {
                    break;
                }
            }
            answer++;
        }
        return answer;
    }
}