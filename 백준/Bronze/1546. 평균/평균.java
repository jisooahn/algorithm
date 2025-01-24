import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] scores = new int[n];
        int maxScore = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
            if (scores[i] > maxScore) {
                maxScore = scores[i];
            }
        }

        double sum = 0;
        for (int score : scores) {
            sum += (double) score / maxScore * 100;
        }
        double average = sum / n;
        System.out.println(average);
    }
}