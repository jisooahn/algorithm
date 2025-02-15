import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next().toUpperCase();
        int[] count = new int[26];
        int max = Integer.MIN_VALUE;
        char value = '?';
        for (char c : s.toCharArray()) {
            count[c - 'A']++;
            if (count[c - 'A'] > max) {
                max = count[c - 'A'];
                value = c;
            } else if (count[c - 'A'] == max) {
                value = '?';
            }
        }
        System.out.println(value);
    }
}