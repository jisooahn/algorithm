class Solution {
    public int solution(String s) {
        int answer = 0;
        int index = 0;

        while (index < s.length()) {
            answer++;
            
            char c = s.charAt(index);
            int sameCount = 0;
            int diffCount = 0;

            while (index < s.length()) {
                if (s.charAt(index) == c) {
                    sameCount++;
                } else {
                    diffCount++;
                }

                index++;

                if (sameCount == diffCount) {
                    break;
                }
            }
        }
        return answer;
    }
}