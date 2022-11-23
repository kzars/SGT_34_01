package basics;

public class MathClass {
    public static void main(String[] args) {

        float num = -5.6f;
        System.out.println(num);

        //Rounding down
        System.out.println("Floor " + Math.floor(num));

        //Rounding up
        System.out.println("Ceil " + Math.ceil(num));

        //According to math rule
        System.out.println("Round " + Math.round(num));

        // ABS
        System.out.println("ABS " + Math.abs(num));

        // Power
        System.out.println("Power " + (int) Math.pow(2, 2));

        // Max
        System.out.println("Max " + Math.max(150,100));

        //Min
        System.out.println("Min " + Math.min(100,150));

        // Max out of 3 number
        System.out.println("Max out of 3 " + Math.max(Math.max(1,2),3));

        // SQRT
        System.out.println("SQRT " + Math.sqrt(64));

        //Random
        System.out.println("Random " + Math.random());
        System.out.println("Random (0-9) " + (int) (Math.random() * 10));
        System.out.println("Random (0-10) " + (int) (Math.random() * 11));
        System.out.println("Random (1-10) " + ((int) (Math.random() * 10) + 1));


    }
}
