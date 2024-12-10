import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int sum = 0;
        int minA = Integer.MAX_VALUE;
        int minB = Integer.MAX_VALUE;
        
        for (int i = 0; i < 4; i++) {
            int tmp = sc.nextInt();
            sum += tmp;
            if (tmp < minA) {
                minA = tmp;
            }
        }
        
        for (int i = 0; i < 2; i++) {
            int tmp = sc.nextInt();
            sum += tmp;
            if (tmp < minB) {
                minB = tmp;
            }
        }
        
        System.out.println(sum - minA - minB);
    }
}