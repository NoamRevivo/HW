import java.util.Scanner;
public class ex2
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int a1,n,d;//ערכים בסדרה חשבונית a1הוא האיבר הראשון n מספר האיברים בסדרה
        System.out.println("הכנס את האיבר הראשון בסדרה החשבונית");
        a1=in.nextInt();
        System.out.println("הכנס את הפרש הסדרה");
        d=in.nextInt();//d הפרש הסדרה
        //do
        {
            System.out.println("הכנס את מספר האיברים בסדרה (חובה להכניס ערך חיובי)");
            n=in.nextInt();
            if (n<=0)
            {
                System.out.println("ערך לא חוקי למספר האיברים בסדרה אנא הכנס ערך חיובי");
            }
            while (n<=0);
            {
                int currentNum = a1;
                for (int i = 0; i < n; i++)
                {
                    System.out.print(currentNum);
                    if (i<n-1)
                    {
                        System.out.print(", ");
                    }
                    currentNum = currentNum + d;
                }
            }
        }
    }
}