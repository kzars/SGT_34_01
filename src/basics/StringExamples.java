package basics;

import java.util.Locale;
import java.util.Scanner;

public class StringExamples {
    public static void main(String[] args) {

/*        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");

        String name = scanner.nextLine().toUpperCase().trim();

        System.out.println("Your name is " + name);

        if(name.equals("BOB")){
            System.out.println("Your name is Bob");
        } else {
            System.out.println("You are not Bob");
        }*/


        String text1 = "This is ";
        String text2 = "new text";

        String result = text1.concat(text2);
        System.out.println(result);
        System.out.println("There are " + result.length() + " characters");

        System.out.println(result.indexOf(" is "));
        System.out.println(result.indexOf('x'));

        System.out.println(result.charAt(0));
        System.out.println(result.charAt(1));
        System.out.println(result.charAt(2));
        System.out.println(result.charAt(3));


        String greetings = "This is holiday time. \nHave a nice holiday.";
        System.out.println(greetings.replaceAll("holiday","Christmas"));
        System.out.println(greetings.replaceFirst("holiday","Christmas"));


        String introduction = "Hello there! My name is Bob and I'm 35";
        System.out.println(introduction.substring(3));
        System.out.println(introduction.substring(3,7));

        String bobsAge = introduction.substring(introduction.length()-2);
        System.out.println("Bob is " + bobsAge + " years old");

        int bobsAgeAsInteger = Integer.parseInt(bobsAge);

        if(bobsAgeAsInteger >= 18){
            System.out.println("Adult");
        } else {
            System.out.println("Child");
        }




        //Wrapper class
        int temp1 = 36;
        Integer temp2 = 36;




        String intStrValue = "1";
        String floatStrValue = "2.0";
        String doubleStrValue = "2.3434343434";
        String booleanStrValue = "true";
        String longStrValue = "100000000000000";

        int intValue = Integer.parseInt(intStrValue);
        double doubleValue = Double.parseDouble(doubleStrValue);
        float floatValue = Float.parseFloat(floatStrValue);
        boolean booleanValue = Boolean.parseBoolean(booleanStrValue);
        long longValue = Long.parseLong(longStrValue);











    }
}
