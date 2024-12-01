import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] vowels = {'A', 'E', 'I', 'O', 'U'};
        
        while (true) {
            String s = sc.nextLine();
            if ("#".equals(s)) {
                break;
            }

            s = s.toUpperCase();
            int count = 0;
            for (char c : s.toCharArray()) {
                for (char vowel : vowels) {
                    if (c == vowel) {
                        count++;
                    }
                }
            }
            
            System.out.println(count);
        }
    }
}