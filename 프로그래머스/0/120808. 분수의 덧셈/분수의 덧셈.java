class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int numer = (numer1 * denom2) + (numer2 * denom1);
        int denom = denom1 * denom2;
        int gcd = getGcd(numer, denom);
        return new int[]{numer / gcd, denom / gcd};
    }
    
    public int getGcd(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        }
        return getGcd(num2, num1 % num2);
    }
}