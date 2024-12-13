import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            int startHour = sc.nextInt();
            int startMinute = sc.nextInt();
            int startSecond = sc.nextInt();
            int endHour = sc.nextInt();
            int endMinute = sc.nextInt();
            int endSecond = sc.nextInt();
            
            int start = startHour * 3600 + startMinute * 60 + startSecond;
            int end = endHour * 3600 + endMinute * 60 + endSecond;
            
            int work = end - start;
            int hours = work / 3600;
            int minutes = (work % 3600) / 60;
            int seconds = (work % 3600) % 60;
            
            System.out.println(hours + " " + minutes + " " + seconds);
        }
    }
}