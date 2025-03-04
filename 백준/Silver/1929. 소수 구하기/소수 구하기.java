import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[] numbers = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            numbers[i] = i;
        }
        
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (numbers[i] == 0) {
                continue;
            }
            for (int j = i + i; j <= n; j += i) {
                numbers[j] = 0;
            }
        }
        
        for (int i = m; i <= n; i++) {
            if (numbers[i] != 0) {
                System.out.println(i);
            }
        }
    }
}