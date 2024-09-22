class Solution {
    public int solution(int balls, int share) {
        return combination(balls, share);
    }
    
    private int combination(int balls, int share) {
        if (share == 0 || balls == share) {
            return 1;
        }
        return combination(balls - 1, share) + combination(balls - 1, share - 1); 
    }
} 