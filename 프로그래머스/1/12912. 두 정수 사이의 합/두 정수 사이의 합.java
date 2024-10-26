class Solution {
    public long solution(int a, int b) {
        if (a > b) {
            int tmp = a;
            a = b;
            b = tmp;
        }
        return (long) (a + b) * (b - a + 1) / 2;
    }
}