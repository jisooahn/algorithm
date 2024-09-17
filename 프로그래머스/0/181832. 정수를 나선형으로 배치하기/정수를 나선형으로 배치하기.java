class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int num = 1;
        int rowMin = 0, rowMax = n - 1;
        int colMin = 0, colMax = n - 1;
        while (num <= n * n) {
            for (int i = colMin; i <= colMax; i++) {
                answer[rowMin][i] = num++;
            }
            rowMin++;
            for (int i = rowMin; i <= rowMax; i++) {
                answer[i][colMax] = num++;
            }
            colMax--;
            for (int i = colMax; i >= colMin; i--) {
                answer[rowMax][i] = num++;
            }
            rowMax--;
            for (int i = rowMax; i >= rowMin; i--) {
                answer[i][colMin] = num++;
            }
            colMin++;
        }
        return answer;
    }
}