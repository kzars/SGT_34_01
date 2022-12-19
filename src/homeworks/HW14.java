package homeworks;

import java.util.Arrays;

public class HW14 {
    public static void main(String[] args) {

        int [] my_array = {10,243,64,23,2,5345,234,54322,4,46,600};
        System.out.println(Arrays.toString(my_array));

        System.out.println(max(my_array));
        System.out.println(min(my_array));

    }

    //Max
    public static int max(int [] array){
        int max = array[0];
        for(int i = 1; i< array.length;i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }

    //Min
    public static int min(int [] array){
        int min = array[0];
        for(int i = 1; i< array.length;i++){
            if(array[i] < min){
                min = array[i];
            }
        }
        return min;
    }

}
