class Solution {
    public boolean solution(int x) {
        int sum = 0;
        for (char c : Integer.toString(x).toCharArray()) {
            sum += c - '0';
        }
        return x % sum == 0;
    }
}