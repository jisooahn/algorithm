import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] charArray = sc.next().toCharArray();
        int start = 0;
        int end = charArray.length - 1;
        boolean isPalindrome = true;
        while (start < end) {
            if (charArray[start++] != charArray[end--]) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println(isPalindrome ? 1 : 0);
    }
}