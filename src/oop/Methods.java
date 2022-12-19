package oop;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name = scanner.nextLine();
        printName(name);
        printName("Bob");
        printName("Lisa");

        //Method with return type
        String text = greetings("Bob");
        System.out.println(text);

        //personInfo
        personInfo("John",45);
        personInfo("John II",67);

        //SUM
        System.out.println(sum(45,78,100));
    }

    public static void printName(String name){
        System.out.println("Hello your name is " + name);
    }

    public static String greetings(String name){
        String result = "Hi " + name;
        return result;
    }

    public static void personInfo(String name, int age){
        System.out.printf("Your name is %s and you are %d years old\n",name,age);
    }

    public static int sum (int num1, int num2, int num3){
        return num1+num2+num3;
    }

}
