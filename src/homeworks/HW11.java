package homeworks;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HW11 {
    public static void main(String[] args) {
        //Personal number
        Scanner scanner = new Scanner(System.in);
        char again = 'y';
        Pattern pattern = Pattern.compile("[0-9]{6}-[0-9]{5}");

        while (again == 'y'){
            //1. Asking for input from user and calling matches method
            System.out.println("Enter your personal number");
            String planeNumber = scanner.nextLine().trim();

            Matcher matcher = pattern.matcher(planeNumber);
            boolean matches = matcher.matches();
            // 2. Determining is input is valid or not
            if(matches){
                System.out.println("Your inputted personal number is valid");
            }else {
                System.out.println("Your inputted personal number is not valid");
            }
            // 3. Asking if user want's to repeat the action
            System.out.println("Do you want to check your personal number again? y/n");
            again = scanner.next().charAt(0);
            scanner.nextLine();

        }

    }
}
