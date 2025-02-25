import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long gcd = getGcd(a, b);
        System.out.println(a * b / gcd);
    }

    public static long getGcd(long a, long b) {
        if (b == 0) {
            return a;
        }
        return getGcd(b, a % b);
    }
}