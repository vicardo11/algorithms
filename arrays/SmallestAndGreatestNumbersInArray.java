// Find the smallest and the greatest numbers in array

import java.util.Arrays;

public class SmallestAndGreatestNumbersInArray {
    public static void findNumbers(int[] array) {
        int greatest = Arrays.stream(array).max().getAsInt();
        int smallest = Arrays.stream(array).min().getAsInt();

        System.out.println("The greatest:" + greatest);
        System.out.println("The smallest:" + smallest);
    }
}
