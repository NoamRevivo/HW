import java.util.Scanner;
public class ex3
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int num,digit,sum=0;

        System.out.println("הכנס מספר");
        num=in.nextInt();
        if (num<0)
        {
            num=num*-1;
        }
        while (num>0)
        {
            digit=num%10;
            sum+=digit;
            num=num/10;
        }
        System.out.println(sum);
    }
}