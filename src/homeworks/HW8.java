package homeworks;

import java.util.Arrays;
import java.util.Scanner;

public class HW8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float sum = 0;

        System.out.println("Please enter array size:");
        int arraySize = scanner.nextInt();

        //Declare empty array in given size
        float storageArray[] = new float[arraySize];

        System.out.println("Please enter array elements one by one");

        for(int i =0; i < storageArray.length; i++){
            System.out.println("Please enter element number: " + (i+1));
            storageArray[i] = scanner.nextFloat();
            sum += storageArray[i];
        }

        System.out.println("Average grade: " + (sum/ storageArray.length));
        System.out.println("There was " + storageArray.length + " grades");
        System.out.println(Arrays.toString(storageArray));
    }
}
