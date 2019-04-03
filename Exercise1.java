import java.util.Scanner;

public class Exercise1 {

        public static void main(String args[]) {
                Scanner scanner = new Scanner(System.in);
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                System.out.println(" Max Common Divisor of a and b is "+isMaxCommonDivisor (a, b));
                System.out.println(" Min Common Multiple of a and b is "+isCommonMultiple (a, b));
        }

        public static int isMaxCommonDivisor (int a, int b) {
                if ((a == 0) || (b == 0)) {
                        return Math.abs (a + b) ;
                }
                
                while (a != b) {
                        if (a > b) {
                                a -= b;
                        } else {
                                b -= a;
                        }
                }
                return a;
        }

        public static int isCommonMultiple (int a, int b) {
                return (a * b)/isMaxCommonDivisor (a, b);
        }
}