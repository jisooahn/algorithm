import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 1;
        for (int i = 0; i < n; i++) {
            result *= 2;
        }
        System.out.println(result);
    }
}