import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int LIMIT = 123456 * 2;
        final boolean[] isPrime = new boolean[LIMIT + 1];
        
        for (int i = 2; i <= LIMIT; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i * i <= LIMIT; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= LIMIT; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }

            int count = 0;
            int start = n + 1;
            int end = 2 * n;
            for (int i = start; i <= end; i++) {
                if (isPrime[i]) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}