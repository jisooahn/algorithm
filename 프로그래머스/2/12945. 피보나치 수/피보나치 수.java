class Solution {
    static int[] memo;
    public int solution(int n) {
        memo = new int[n + 1];
        return f(n);
    }
    public int f(int n) {
        if (memo[n] > 0) {
            return memo[n];
        }
        if (n == 0) {
            return memo[n] = 0;
        } else if (n == 1) {
            return memo[n] = 1;
        }
        return memo[n] = (f(n - 2) + f(n - 1)) % 1234567;
    }
}