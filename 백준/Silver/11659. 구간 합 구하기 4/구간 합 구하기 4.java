import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] sum = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            sum[i] = sum[i - 1] + sc.nextInt();
        }
        for (int count = 0; count < m; count++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            System.out.println(sum[j] - sum[i - 1]);
        }
    }
}