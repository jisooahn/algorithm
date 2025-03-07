import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] scores = new int[n];
        int maxScore = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
            if (scores[i] > maxScore) {
                maxScore = scores[i];
            }
            sum += scores[i];
        }
        double average = (double) sum / maxScore * 100 / n;
        System.out.println(average);
    }
}