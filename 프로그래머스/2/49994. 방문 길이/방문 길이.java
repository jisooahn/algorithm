import java.util.*;

class Solution {
    public int solution(String dirs) {
        Set<String> answer = new HashSet<>();
        Map<Character, int[]> d = Map.of(
            'U', new int[]{1, 0},
            'D', new int[]{-1, 0},
            'R', new int[]{0, 1},
            'L', new int[]{0, -1}
        );

        int[] curPos = {5, 5};
        for (char dir : dirs.toCharArray()) {
            int[] nextPos = d.get(dir);
            int nextRow = curPos[0] + nextPos[0];
            int nextCol = curPos[1] + nextPos[1];

            if (isValidPosition(nextRow, nextCol)) {
                String edge = "" + curPos[0] + curPos[1] + nextRow + nextCol;
                String reverseEdge = "" + nextRow + nextCol + curPos[0] + curPos[1];
                answer.add(edge);
                answer.add(reverseEdge);
                curPos[0] = nextRow;
                curPos[1] = nextCol;
            }
        }
        return answer.size() / 2;
    }

    private boolean isValidPosition(int row, int col) {
        return (0 <= row && row < 11) && (0 <= col && col < 11);
    }
}