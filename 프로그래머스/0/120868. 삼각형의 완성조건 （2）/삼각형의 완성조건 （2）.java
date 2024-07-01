class Solution {
    public int solution(int[] sides) {
        int min = Math.min(sides[0], sides[1]);
        int max = Math.max(sides[0], sides[1]);
        return (max + min) - (max - min) - 1;
    }
}