import java.time.Duration;
import java.time.LocalTime;
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
            
            LocalTime start = LocalTime.of(startHour, startMinute, startSecond);
            LocalTime end = LocalTime.of(endHour, endMinute, endSecond);

            Duration work = Duration.between(start, end);
            long hours = work.toHours();
            int minutes = work.toMinutesPart();
            int seconds = work.toSecondsPart();
            
            System.out.println(hours + " " + minutes + " " + seconds);
        }
    }
}