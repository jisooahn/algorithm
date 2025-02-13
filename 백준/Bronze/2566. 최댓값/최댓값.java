import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int row = 0;
        int col = 0;
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                int tmp = sc.nextInt();
                if (tmp > max) {
                    max = tmp;
                    row = i;
                    col = j;
                }
            }
        }
        System.out.println(max);
        System.out.println(row + " " + col);
    }
}