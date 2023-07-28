import java.util.Scanner;
class Assignement1_4
{
    public static void main(String[] args)
    {
        Scanner aa=new Scanner(System.in);
        System.out.println("Enter How many Prime Nos You Want");
        int cnt=aa.nextInt();
        int num=2;
        while(cnt>0)
        {
        int flag=0;
        for(int i=2;i<num;i++)
        {
            if(num%i==0)
            {
                flag=1;
                break;
            }
        }
        if(flag==0)
        {
            cnt--;
        System.out.print(num+" ");
        }
        num++;
        }
    }
}