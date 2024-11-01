class Solution {
    private static int[][] DIRECTIONS = {{-1, -1}, {-1, 0}, {-1, 1}, {0, -1}, {0, 1}, {1, -1}, {1, 0}, {1, 1}};
    
    public int solution(int[][] board) {
        int n = board.length;
        boolean[][] dangerZone = new boolean[n][n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 1) {
                    dangerZone[i][j] = true;
                    for (int k = 0; k < DIRECTIONS.length; k++) {
                        int nearX = i + DIRECTIONS[k][0];
                        int nearY = j + DIRECTIONS[k][1];
                        if (!(0 <= nearX && nearX < n && 0 <= nearY && nearY < n)) {
                            continue;
                        }
                        dangerZone[nearX][nearY] = true;
                    }
                }
            }
        }
        
        int answer = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!dangerZone[i][j]) {
                    answer++;
                }
            }
        }
        return answer;
    }
}