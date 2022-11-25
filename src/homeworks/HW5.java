package homeworks;

import java.util.Scanner;

public class HW5 {
    public static void main(String[] args) {

        /*Alex is an owner of grocery store. Among many products he sells,
        he's mostly famous for his hand-made jam, that is being
        sold in jars of 1kg or 7kg. Alex sells only full jars
        (i.e. it's only possible to buy the whole jar of 1kg, or 7kg).

        Will is asked by his wife Jane to buy some amount of Alex's jam.
        Will forgot to take his bag, thus he can take home no more than six jars of jam
        (three jars in each of his two hands). Jane is very serious about the
        shopping list - if she asked for specific amount of jam, she expects exactly this
        amount, no more, no less.

        Write an application that will check if Will is able to take home the
        amount of jam specified by Jane. Amount of jam should be read from user
        (positive int value). You can assume that there's always enough jam in Alex's shop.
        Your application should print true or false.*/

        Scanner scanner = new Scanner(System.in);
        int amountOfJam = scanner.nextInt();

        //Let's calculate how many big jars we need - if possible we prefer to buy only big jars
        //Division / of integer values in Java "cuts" non-integer part of the result
        //For example:
        // 10 / 7 = 1
        // 5 / 7 = 0
        // 21 / 7 = 3
        int amountOf7KgJars = amountOfJam / 7;
        System.out.println("amountOf7KgJars = " + amountOf7KgJars);

        int amountOF1KgJars = amountOfJam % 7;
        System.out.println("amountOF1KgJars = " + amountOF1KgJars);

        System.out.println(amountOf7KgJars + amountOF1KgJars <= 6);

    }
}
