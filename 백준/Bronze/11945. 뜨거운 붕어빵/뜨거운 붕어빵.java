import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        while (sc.hasNext()) {
            StringBuilder input = new StringBuilder(sc.next());
            System.out.println(input.reverse());
        }
    }
}