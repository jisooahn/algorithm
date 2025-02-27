import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] tree = new int[n];
        for (int i = 0; i < n; i++) {
            tree[i] = sc.nextInt();
        }

        int gcd = tree[1] - tree[0];
        for (int i = 2; i < n; i++) {
            gcd = getGcd(gcd, tree[i] - tree[i - 1]);
        }

        int count = 0;
        for (int i = 1; i < n; i++) {
            count += (tree[i] - tree[i - 1]) / gcd - 1;
        }
        System.out.println(count);
    }

    public static int getGcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return getGcd(b, a % b);
    }
}