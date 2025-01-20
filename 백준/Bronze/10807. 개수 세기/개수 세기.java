import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[201];
        for (int i = 0; i < n; i++) {
            int index = sc.nextInt();
            numbers[index + 100]++;
        }
        int v = sc.nextInt();
        System.out.println(numbers[v + 100]);
    }
}