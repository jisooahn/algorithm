import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] students = new int[31];
        for (int i = 0; i < 28; i++) {
            int index = sc.nextInt();
            students[index]++;
        }
        for (int i = 1; i < students.length; i++) {
            if (students[i] == 0) {
                System.out.println(i);
            }
        }
    }
}