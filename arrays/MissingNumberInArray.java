// Find missing number in array of integers.

import java.util.Arrays;

public class MissingNumberInArray {
    public static void missingNumber(int[] array) {
        Arrays.sort(array);

        for (int i = 0; i < array.length - 1; i++) {
            int difference = array[i + 1] - array[i];
            if(difference > 1){
                System.out.println(array[i] + 1);
            }
        }
    }
}
