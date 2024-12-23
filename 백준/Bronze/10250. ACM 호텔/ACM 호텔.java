import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int h = sc.nextInt();
            int w = sc.nextInt();
            int n = sc.nextInt();
            int y = (n % h == 0) ? h : n % h;
            int x = (n % h == 0) ? n / h : n / h + 1;
            System.out.println(y * 100 + x);
        }
    }
}