import java.util.Scanner;

class Assignement1_1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a integer number: ");
        int n = sc.nextInt();

        if(n/2!=0)
        {
            System.out.println("Werid");
        }
        else
        {
            if(n >=2 && n<=5)
            {
                System.out.println("Not weird");
            }
            else if(n>=6 && n<=20)
            {
               System.out.println("Weird");
            }
            else
            {
                System.out.println("Not Weird");
            }
        }
    }
}