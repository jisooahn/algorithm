import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] fingers = {2, 1, 2, 3, 4, 5, 4, 3};
        System.out.println(fingers[n % 8]);
    }
}