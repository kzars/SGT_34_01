package basics;

import java.util.Scanner;

public class NestedIf {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name");
        String name = scanner.nextLine();

        System.out.println("Please enter your score");
        float score = scanner.nextFloat();

        if(score <= 40.0f){
            System.out.println(name + " got: <= 40%");
        } else if (score > 40.0f && score <= 80.0f) {
            System.out.println(name + " got: <=80%");
            if (score <= 60.0f){
                System.out.println("<=60%");
            }else {
                System.out.println(">60%");
            }
        }else {
            System.out.println(name + " got: <= 100%");
        }


    }
}
