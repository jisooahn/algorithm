class Solution {
    public String solution(int[] food) {
        StringBuilder left = new StringBuilder();
        for (int i = 1; i < food.length; i++) {
            int n = food[i] / 2;
            for (int j = 0; j < n; j++) {
                left.append(i);
            }
        }
        StringBuilder right = new StringBuilder(left).reverse();
        return left.append(0).append(right).toString();
    }
}