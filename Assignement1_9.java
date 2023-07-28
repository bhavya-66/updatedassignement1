import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
class Assignement1_9{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input as numbers (day, month, year)
        System.out.print("Enter day: ");
        int day = sc.nextInt();
        System.out.print("Enter month: ");
        int month = sc.nextInt();
        System.out.print("Enter year: ");
        int year = sc.nextInt();

        LocalDate dateFromNumbers = LocalDate.of(year, month, day);
        System.out.println("Date from numbers: " + dateFromNumbers);

   
        sc.nextLine(); 

        System.out.print("Enter date (yyyy-MM-dd): ");
        String dateString = sc.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate dateFromString = LocalDate.parse(dateString, formatter);
        System.out.println("Date from string: " + dateFromString);
    }
}
