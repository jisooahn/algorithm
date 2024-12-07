import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int dayOfMonth = sc.nextInt();

        LocalDate specialDate = LocalDate.of(2015, 2, 18);
        LocalDate inputDate = LocalDate.of(2015, month, dayOfMonth);

        if (inputDate.isBefore(specialDate)) {
            System.out.println("Before");
        } else if (inputDate.isAfter(specialDate)) {
            System.out.println("After");
        } else {
            System.out.println("Special");
        }
    }
}