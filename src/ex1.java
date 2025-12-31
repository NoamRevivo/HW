import java.util.Scanner;
public class ex1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a, b, c;
        double x1, x2;
        double delta;
        System.out.println("הכנס מספר כמקדם של A (לא ניתן להכניס 0):");
        a = in.nextDouble();
        while (a == 0) {
            System.out.println("שגיאה: המקדם A לא יכול להיות 0. נסה שוב:");
            a = in.nextDouble();
        }
        System.out.println("הכנס מספר כמקדם של B:");
        b = in.nextDouble();
        System.out.println("הכנס מספר כמקדם של C:");
        c = in.nextDouble();
        delta = b * b - 4 * a * c;
        if (delta > 0)
        {
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("למשוואה קיימים 2 פתרונות:");
            System.out.println("x1 = " + x1); // הוספתי כיתוב להבנה
            System.out.println("x2 = " + x2);
        }
        else if (delta == 0) {
            x1 = -b / (2 * a);
            System.out.println("למשוואה פתרון יחיד:");
            System.out.println("x = " + x1);
        }
        else {
            System.out.println("למשוואה הריבועית אין פתרונות ממשיים");
        }
    }
}