public class ex7 {
    public static void main(String args[]) {
        int pow;
        pow = 3;
        System.out.println("המספרים הנרקסיסטים בין 1-1000 הם");
        for (int i = 1; i <= 9; i++) //כל מספר בין ספרה 1 הוא נרקיסיסטי
        {
            System.out.println(i);
        }
        for (int i = 100; i < 1000; i++)
        {
            int tempNum = i;
            int sumOfPow = 0;
            while (tempNum > 0)
            {
                int digit = tempNum % 10;
                sumOfPow = sumOfPow + (int) Math.pow(digit, pow);
                tempNum = tempNum / 10;

            }
            if (sumOfPow == i)
            {
                System.out.println(i);
            }
        }

    }
}