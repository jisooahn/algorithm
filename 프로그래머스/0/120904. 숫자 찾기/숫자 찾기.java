class Solution {
    public int solution(int num, int k) {
        String number = Integer.toString(num);
        String digit = Integer.toString(k);
        int answer = number.indexOf(digit);
        return answer == -1 ? answer : ++answer;
    }
}