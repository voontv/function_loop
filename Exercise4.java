import java.util.Scanner;

public class Exercise4 {

        public static void main(String args[]) {
                Scanner scanner = new Scanner(System.in);
                int a = scanner.nextInt();
                System.out.println(" List Digit of Integer when split Digit Prime is "+isListDigitPrime (a));
        } 

        public static boolean isPrime (int a) {
                boolean check = true;
                if (a < 1) {
                        return false;
                }

                for (int i=2; i<=a/2; i++) {
                        if (a % i == 0) {
                                return false;
                        }
                }
                return check;
        }

        public static String isListDigitPrime (int a) {
                StringBuilder builder = new StringBuilder();
                int i = 2;
                int count = 0;

                while (a>=i) {
                        if ((a % i == 0) && isPrime (i)) {
                                count++;
                                a = a/i;
                        } else {
                                i++;
                        }

                        if (a % i != 0 && isPrime (i)) {
                                String s = i +"";
                                if (count > 1) {
                                        s+="^"+count;
                                }

                                if(a < i){
                                        builder = builder.append(s);
                                } else {
                                        builder = builder.append(s + " * ");
                                }
                                count = 0;
                        }
                }
                return builder.toString();
        }
}