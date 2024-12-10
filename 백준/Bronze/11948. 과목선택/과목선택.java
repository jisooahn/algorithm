import java.util.Arrays;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] scores = new int[4];
        for (int i = 0; i < scores.length; i++) {
            scores[i] = sc.nextInt();
        }
        Arrays.sort(scores);
        int sumA = scores[1] + scores[2] + scores[3];
        
        int e = sc.nextInt();
        int f = sc.nextInt();
        int sumB = Math.max(e, f);
        
        System.out.println(sumA + sumB);
    }
}