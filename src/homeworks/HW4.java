package homeworks;

import java.util.Scanner;

public class HW4 {
    public static void main(String[] args) {

 /*     Write an application, that will read two numbers from user
        (of type int) and will print true, if both numbers are the
        same sign (both are positive, or both are negative), or false
        otherwise.

        If at least one of given numbers is equal to 0, your application
        should print false.*/

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        // Working, yet not sophisticated solution is to use conditional expression
        if ((a > 0 && b > 0) || (a < 0 && b < 0)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
