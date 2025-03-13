import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int start = 1, end = 1;
        int count = 0, sum = 1;
        while (end <= n) {
            if (sum < n) {
                end++;
                sum += end;
            } else if (sum > n) {
                sum -= start;
                start++;
            } else {
                count++;
                sum -= start;
                start++;
            }
        }
        System.out.println(count);
    }
}