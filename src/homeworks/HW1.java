package homeworks;

import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {

        // Using scanner ask user to enter name and year of birth
        // Print out:
        // basics.Input: John, 2000
        // "Your name is John and you are 22 years old"

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name");

        String name = scanner.nextLine();

        System.out.println("Please enter your birth year");
        int birthYear = scanner.nextInt();

        int age =  2022 - birthYear;

        System.out.println("Your name is " + name + " and you are " + age + " years old");
    }
}
