public class Operators {
    public static void main(String[] args) {

        // ASSIGNMENT OPERATORS =, +=, -=, *=, /=
        int a = 100;
        System.out.println("a = " + a);
        a *= 10;
        System.out.println("a = " + a);

        //BASIC ARITHMETIC OPERATORS -, +, *, /, %

        int x = 100;
        x = 45 + 10;
        x = 15 * 3;
        System.out.println("x = " + x);

        System.out.println(x + 15);

        //INCREMENTATION OPERATORS & DECREMENTATION OPERATORS
        //Post-incrementation
        int num1 = 10;
        num1++;
        System.out.println("num1 = " + num1);
        System.out.println("num1 = " + num1++);
        System.out.println("num1 = " + num1);

        //Pre-incrementation
        System.out.println("num1 = " + --num1);

        // 4 ways to increase or decrease variable by one
        num1 += 1;
        num1 = num1 + 1;
        num1++;
        ++num1;

        //RELATIONAL OPERATORS
        //Equality ==
        int i = 10;
        int b = 10;
        System.out.println("Equality " + (i==b));

        //Inequality !=
        System.out.println("Inequality " + (i!=b) );

        //Greater than > and greater than or equal to >=
        System.out.println("Grater than " + (i > b));
        System.out.println("Grater than or equal to " + (i >= b));

        //Less than < and less than or equal to <=
        System.out.println("Less than " + (i < b));
        System.out.println("Less than or equal to " + (i <= b));

        //LOGICAL OPERATORS
        //Logical AND - &&

        boolean sun = true;
        boolean dry = true;

        System.out.println("I will go outside " +  (sun && dry) );





    }
}
