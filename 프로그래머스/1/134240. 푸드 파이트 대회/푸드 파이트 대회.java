class Solution {
    public String solution(int[] food) {
        StringBuilder left = new StringBuilder();
        for (int i = 1; i < food.length; i++) {
            left.append(Integer.toString(i).repeat(food[i] / 2));
        }
        StringBuilder right = new StringBuilder(left).reverse();
        return left.append(0).append(right).toString();
    }
}