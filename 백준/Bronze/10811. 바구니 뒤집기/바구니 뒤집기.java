import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] basket = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            basket[i] = i;
        }
        for (int count = 0; count < m; count++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            for (int start = i, end = j; start < end; start++, end--) {
                int tmp = basket[start];
                basket[start] = basket[end];
                basket[end] = tmp;
            }
        }
        for (int i = 1; i <= n; i++) {
            System.out.print(basket[i] + " ");
        }
    }
}