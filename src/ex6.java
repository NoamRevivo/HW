import java.util.Scanner;
public class ex6
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int rows;
        boolean valid;

        System.out.println("אנא הכנס מספר חיובי אי-זוגי וגדול מ-3 (למשל: 5, 7, 9...):");
        do {


            rows = in.nextInt();


            if (rows % 2 == 0 || rows < 3) {
                System.out.println("קלט לא תקין. נא להכניס שוב את המספר:");
                valid = false;
            } else {
                valid = true;
            }
        } while (!valid);
        int half = rows / 2;

        for (int i = 0; i <= half; i++) {

            for (int j = 0; j < half - i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
        for (int i = half - 1; i >= 0; i--) {

            for (int j = 0; j < half - i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}