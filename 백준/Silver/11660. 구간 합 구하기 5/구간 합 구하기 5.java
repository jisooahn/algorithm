import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] matrix = new int[n + 1][n + 1];
        int[][] sum = new int[n + 1][n + 1];
        for (int row = 1; row <= n; row++) {
            st = new StringTokenizer(br.readLine());
            for (int col = 1; col <= n; col++) {
                matrix[row][col] = Integer.parseInt(st.nextToken());
                sum[row][col] = sum[row - 1][col] + sum[row][col - 1] + matrix[row][col] - sum[row - 1][col - 1];
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            sb.append(sum[x2][y2] - sum[x1 - 1][y2] - sum[x2][y1 - 1]+ sum[x1 - 1][y1 - 1]).append("\n");
        }
        System.out.println(sb);
    }
}