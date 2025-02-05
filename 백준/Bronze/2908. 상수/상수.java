import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder reverseA = new StringBuilder(sc.next()).reverse();
        StringBuilder reverseB = new StringBuilder(sc.next()).reverse();

        int a = Integer.parseInt(reverseA.toString());
        int b = Integer.parseInt(reverseB.toString());

        System.out.println(Math.max(a, b));
    }
}