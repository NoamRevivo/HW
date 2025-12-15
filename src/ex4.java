import java.util.Scanner;
public class ex4
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("הכנס מספר שלם הערך יוכנס ל-n");
        n = in.nextInt();
        int counter=0;
        int number=2;

        while (counter<n)//בדיקה עד שנמצא את n המספרים
        {
            boolean flag=true;
            for (int j = 2; j*j<= number; j++)
            {
                if (number%j==0)
                {
                    flag=false;
                    break;
                }

            }
            if (flag)
            {
                System.out.println(number);
                counter++;
            }
            number++;
        }

    }
}