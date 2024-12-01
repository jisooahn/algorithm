import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Character> vowels = new HashSet<>(Arrays.asList('A', 'E', 'I', 'O', 'U'));
        
        while (true) {
            String s = sc.nextLine();
            if ("#".equals(s)) {
                break;
            }

            s = s.toUpperCase();
            int count = 0;
            for (char c : s.toCharArray()) {
                if (vowels.contains(c)) {
                    count++;
                }
            }
            
            System.out.println(count);
        }
    }
}