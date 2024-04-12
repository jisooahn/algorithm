import java.util.*;

class Solution {

    static int[] dr = {0, 1, 0, -1};
    static int[] dc = {1, 0, -1, 0};
    static boolean[][] visited;

    public int solution(int[][] maps) {
        int shortestDist = -1;
        int rowLength = maps.length;
        int colLength = maps[0].length;
        visited = new boolean[rowLength][colLength];

        if (maps[0][0] == 0 || maps[rowLength - 1][colLength - 1] == 0) {
            return shortestDist;
        }

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0, 0, 1});
        visited[0][0] = true;

        while (!queue.isEmpty()) {
            int[] curPos = queue.poll();
            int curRow = curPos[0];
            int curCol = curPos[1];
            int curDist = curPos[2];

            if (curRow == rowLength - 1 && curCol == colLength - 1) {
                shortestDist = curDist;
                return shortestDist;
            }

            for (int i = 0; i < 4; i++) {
                int nextRow = curRow + dr[i];
                int nextCol = curCol + dc[i];
                int nextDist = curDist + 1;

                if ((0 <= nextRow && nextRow < rowLength) && (0 <= nextCol && nextCol < colLength) && maps[nextRow][nextCol] == 1) {
                    if (!visited[nextRow][nextCol]) {
                        queue.offer(new int[]{nextRow, nextCol, nextDist});
                        visited[nextRow][nextCol] = true;
                    }
                }
            }
        }
        return shortestDist;
    }
}