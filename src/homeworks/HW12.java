package homeworks;


import java.util.Scanner;

public class HW12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char again = 'y';

        while (again == 'y'){
            // 1.
            System.out.println("Enter a name");
            String input = scanner.nextLine().toLowerCase().trim().replaceAll(" ","");
            boolean isPalindorme = true;

            //2.
            for(int i = 0; i < input.length() / 2; i++){
                if(input.charAt(i) != input.charAt(input.length() - i - 1)){
                    isPalindorme = false;
                    break;
                }
            }
            if (isPalindorme){
                System.out.printf("Your input %s is a palindrome \n", input);
            } else {
                System.out.printf("Your input %s is not a palindrome \n", input);
            }

            //3.
            System.out.println("Do you want to check something again? y (yes)/n (no)");
            again = scanner.next().charAt(0);
            scanner.nextLine();
        }
    }
}
