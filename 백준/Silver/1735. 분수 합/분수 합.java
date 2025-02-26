import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numerator1 = sc.nextInt();
        int denominator1 = sc.nextInt();
        int numerator2 = sc.nextInt();
        int denominator2 = sc.nextInt();

        int numerator = numerator1 * denominator2 + numerator2 * denominator1;
        int denominator = denominator1 * denominator2;

        int gcd = getGcd(numerator, denominator);

        System.out.println(numerator / gcd + " " + denominator / gcd);
    }

    public static int getGcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return getGcd(b, a % b);
    }
}