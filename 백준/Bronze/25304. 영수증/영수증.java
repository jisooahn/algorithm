import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int totalPrice = 0;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            totalPrice += a * b;
        }
        if (x == totalPrice) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}