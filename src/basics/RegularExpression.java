package basics;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    public static void main(String[] args) {

        // 1 Example
        Pattern pattern = Pattern.compile("a+b");
        Matcher matcher = pattern.matcher("aaab");

        System.out.println(matcher.matches());
        System.out.println(matcher.find());

        // 2 Example
        // Any 3 lowercase letters or any number 5-9
        System.out.println(Pattern.matches("[a-z5-9]{3}","9x8"));

        // 2 Uppercase letter, 2 Lowercase letter 3 numbers
        System.out.println(Pattern.matches("[A-Z]{2}[a-z]{2}[0-9]{3}","GDjh255"));

        // 7 any letters or any numbers
        System.out.println(Pattern.matches("[a-zA-Z0-9]{7}","GDjh255"));

        // Examples: NF-3422
        //           GF-234
        //           GW-01

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your car's plate number");
        String plateNumber = scanner.nextLine();

        // 2 Uppercase letters followed by one "-" and then (2-4) numbers
        Pattern pattern1 = Pattern.compile("[A-Z]{2}-[0-9]{2,4}");
        Matcher matcher1 = pattern1.matcher(plateNumber);

        boolean validPlateNumber = matcher1.matches();

        if(validPlateNumber){
            System.out.println("Your plate number is valid");
        }else {
            System.out.println("Your plate number is not valid");
        }

    }
}
