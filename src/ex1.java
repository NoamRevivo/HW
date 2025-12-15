import java.util.Scanner;
public class ex1
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double a, b, c;//עבור מקדמים של המשוואה
        double x1, x2;//כערכים לתוצאות המשוואה
        double delta;
        System.out.println("הכנס מספר כמקדם של A לא ניתן להכניס 0 לערך זה");
        a = in.nextDouble();
        System.out.println("הכנס מספר כמקדם של B");
        b=in.nextDouble();
        System.out.println("הכנס מספר כמקדם של C");
        c=in.nextDouble();
        delta=b*b-4*a*c;
        if (delta>0)
        {
            System.out.println("למשוואה קיימים 2 פתרונות והם");
            x1 = (-b+ Math.sqrt(delta) )/ (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println(x1);
            System.out.println(x2);
        }
        if (delta<0)
        {
            System.out.println("למשוואה הריבועית אין פתרונות");
        }
        if (delta==0)
        {
            x1 = (-b)/(2 * a);
            System.out.println("שני פתרונות המשוואה זהיים");
            System.out.println(x1);
        }
    }
}