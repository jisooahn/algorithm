import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int[][] board) {
        int rows = board.length;
        int cols = board[0].length;
        List<int[]> mines = new ArrayList<>();
        int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (board[i][j] == 1) {
                    mines.add(new int[]{i, j});
                }
            }
        }
        
        for (int[] mine : mines) {
            int x = mine[0];
            int y = mine[1];
            for (int k = 0; k < 8; k++) {
                int nextX = x + dx[k];
                int nextY = y + dy[k];
                if (0 <= nextX && nextX < rows && 0 <= nextY && nextY < cols && board[nextX][nextY] == 0) {
                    board[nextX][nextY] = 1;
                }
            }
        }
        
        int answer = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (board[i][j] == 0) {
                    answer++;
                }
            }
        }
        return answer;
    }
}