import java.util.Scanner;

 class Assignement1_8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        

        boolean isLeapYear = checkLeapYear(year);

        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }

    public static boolean checkLeapYear(int year) {
        if (year % 4 == 0)
        {
            if (year % 100 == 0) 
            {
                return year % 400 == 0;
            }
            else
            {
                return true;
            }
        }
        else
        {
            return false;
        }
    }
}
