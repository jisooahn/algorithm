import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();
        int diff = sc.nextInt();
        if (diff > sum) {
            System.out.println(-1);
        } else {
            int a = (sum + diff) / 2;
            int b = (sum - diff) / 2;
            if (a + b == sum && a - b == diff) {
                System.out.println(a + " " + b);
            } else {
                System.out.println(-1);
            }
        }
    }
}