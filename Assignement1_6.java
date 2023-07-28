import java.util.Scanner;
public class Assignement1_6
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter digits: ");     
        int num = scanner.nextInt();
        int reversed = 0;
        while(num != 0) 
        {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
         System.out.println("The reversed number is " + reversed);
    }
}