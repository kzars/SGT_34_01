package basics;

public class Casting {
    public static void main(String[] args) {


        int num1 = 100;
        System.out.println(num1);

        float num2 = num1;
        System.out.println(num2);

        num2 += 0.1f;
        System.out.println(num2);

        float temp = 36.6f;
        System.out.println(temp);

        int temp2 = (int) temp;
        System.out.println(temp2);

    }
}
