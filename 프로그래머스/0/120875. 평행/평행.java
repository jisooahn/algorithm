class Solution {
    public int solution(int[][] dots) {
        int[][] pairs = {
            {0, 1, 2, 3},
            {0, 2, 1, 3},
            {0, 3, 1, 2}
        };
        
        for (int[] pair : pairs) {
            if (calculateGradient(dots[pair[0]], dots[pair[1]]) == calculateGradient(dots[pair[2]], dots[pair[3]])) {
                return 1;
            }
        }
        
        return 0;
    }
    
    private double calculateGradient(int[] dot1, int[] dot2) {
        return (double) (dot1[1] - dot2[1]) / (dot1[0] - dot2[0]);
    }
}