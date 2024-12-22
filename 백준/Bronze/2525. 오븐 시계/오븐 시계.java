import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        b += c;
        if (b >= 60) {
            a = (a + (b / 60)) % 24;
            b = b % 60;
        }
        System.out.println(a + " " + b);
    }
}