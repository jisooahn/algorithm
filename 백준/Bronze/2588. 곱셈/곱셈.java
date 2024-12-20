import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        char[] second = sc.next().toCharArray();
        
        int sum = 0;
        int digit = 1;
        for (int i = second.length - 1; i >= 0; i--) {
            int tmp = Integer.parseInt(String.valueOf(second[i]));
            System.out.println(first * tmp);
            sum += (first * tmp) * digit;
            digit *= 10;
        }
        System.out.println(sum);
    }
}