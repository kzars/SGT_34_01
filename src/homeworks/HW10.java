package homeworks;

import java.util.Arrays;

public class HW10 {
    public static void main(String[] args) {
        int [] myArray = {1,2,3,4,5,6,20,7,8,9,10,11,12};
        System.out.println("Original array: " + Arrays.toString(myArray));

        int [] reverseArray = new int[myArray.length];

        System.out.println("Reverse array (by creating new array): " + Arrays.toString(reverseArray));
        for (int i =0; i < myArray.length; i++){
            reverseArray[i] = myArray[myArray.length-1-i];
        }

        System.out.println("Reverse array (by creating new array): " + Arrays.toString(reverseArray));




        for(int i = 0; i < myArray.length/2; i++){
            int temp = myArray[i];
            myArray[i] = myArray[myArray.length-1-i];
            myArray[myArray.length-1-i] = temp;
        }
        System.out.println("Reverse array: " + Arrays.toString(myArray));

    }
}
