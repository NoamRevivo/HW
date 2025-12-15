import java.util.Scanner;
public class ex5
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int num;
        boolean isFibonacci=false;
        System.out.println("הכנס מספר שלם לבדיקה האם הוא ערך בסדרת פיבונצ'י");
        num=in.nextInt();
        if (num==0||num==1)
        {
            isFibonacci=true;
        }
        else
        {
            int firstFibo = 0;
            int secondFibo = 1;
            int nextFib;
            while (secondFibo <= num)
            {
                nextFib = firstFibo + secondFibo;
                firstFibo = secondFibo;
                secondFibo = nextFib;
                if (secondFibo == num)
                {
                    isFibonacci=true;
                    break;
                }
            }
            if (isFibonacci)
                System.out.println(num+"המספר הוא ערך בסדרת פיבונצי");
            else
                System.out.println(num+"המספר שהוכנס אינו ערך בסדרת פיבונצי");
        }

    }
}