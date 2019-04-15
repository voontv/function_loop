import java.util.Scanner;

public class Exercise2 {

        public static void main(String args[]) {
                Scanner scanner = new Scanner(System.in);
                int a = scanner.nextInt();
                System.out.println(" Total digit in Integer is "+isTotalDigitInInteger (a));
                System.out.println(" Multiply digit in Integer is "+isMultiplyDigitInInteger (a));
        }

        public static int isTotalDigitInInteger (int a) {
                int result = 0;

                while (a > 0) {
                        result += a%10;
                        a       = a/10;
                }
                return result;
        }

        public static int isMultiplyDigitInInteger (int a) {
                int result = 1;

                while (a > 0) {
                        result *= a%10;
                        a       = a/10;
                }
                return result;
        }
}