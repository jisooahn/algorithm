import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int k = sc.nextInt();
        int h = sc.nextInt();

        if (s + k + h >= 100) {
            System.out.println("OK");
        } else {
            int min = Math.min(Math.min(s, k), h);
            if (min == s) {
                System.out.println("Soongsil");
            } else if (min == k) {
                System.out.println("Korea");
            } else {
                System.out.println("Hanyang");
            }
        }
    }
}