class Solution {
    public int solution(int[][] dots) {
        if (calculateGradient(dots[0], dots[1]) == calculateGradient(dots[2], dots[3])) {
            return 1;
        }
        
        if (calculateGradient(dots[0], dots[2]) == calculateGradient(dots[1], dots[3])) {
            return 1;
        }
        
        if (calculateGradient(dots[0], dots[3]) == calculateGradient(dots[1], dots[2])) {
            return 1;
        }
        
        return 0;
    }
    
    private double calculateGradient(int[] dot1, int[] dot2) {
        return (double) (dot1[1] - dot2[1]) / (dot1[0] - dot2[0]);
    }
}