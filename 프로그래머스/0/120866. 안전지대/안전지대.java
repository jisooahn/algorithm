class Solution {
    public int solution(int[][] board) {
        int n = board.length;
        int[][] directions = {{-1, -1}, {-1, 0}, {-1, 1}, {0, -1}, {0, 1}, {1, -1}, {1, 0}, {1, 1}};
        int[][] extendedBoard = new int[n + 2][n + 2];
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                extendedBoard[i][j] = board[i - 1][j - 1];
            }
        }
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (extendedBoard[i][j] == 1) {
                    for (int[] direction : directions) {
                        int x = i + direction[0];
                        int y = j + direction[1];
                        if (extendedBoard[x][y] == 0) {
                            extendedBoard[x][y] = 2;
                        }
                    }
                }
            }
        }
        
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (extendedBoard[i][j] == 0) {
                    answer++;
                }
            }
        }
        return answer;
    }
}