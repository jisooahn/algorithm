class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] now = {0, 0};
        int maxX = board[0] / 2;
        int maxY = board[1] / 2;
        
        for (String key : keyinput) {
            switch (key) {
                case "right" -> now[0] = Math.min(now[0] + 1, maxX);
                case "left" -> now[0] = Math.max(now[0] - 1, -maxX);
                case "up" -> now[1] = Math.min(now[1] + 1, maxY);
                case "down" -> now[1] = Math.max(now[1] - 1, -maxY);
            }
        }
        return now;
    }
}