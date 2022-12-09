package homeworks;

import java.util.Arrays;
import java.util.Scanner;

public class HW7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        System.out.println("Please enter array size:");
        int arraySize = scanner.nextInt();

        //Declare empty array in given size
        int storageArray[] = new int[arraySize];

        System.out.println("Please enter array elements one by one");

        for(int i =0; i < storageArray.length; i++){
            System.out.println("Please enter element number: " + (i+1));
            storageArray[i] = scanner.nextInt();
            sum += storageArray[i];
        }

        System.out.println(Arrays.toString(storageArray));
        System.out.println("Sum " + sum);


    }
}
