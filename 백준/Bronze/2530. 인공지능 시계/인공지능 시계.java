import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int s = sc.nextInt();
        int additionalSeconds = sc.nextInt();
        int totalSeconds = (h * 60 * 60) + (m * 60) + s + additionalSeconds;
        h = (totalSeconds / (60 * 60)) % 24;
        m = (totalSeconds % (60 * 60)) / 60;
        s = totalSeconds % 60;
        System.out.println(h + " " + m + " " + s);
    }
}