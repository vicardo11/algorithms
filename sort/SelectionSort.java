public class SelectionSort {

    public static void sortArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            int j = i + 1;

            while (j < array.length - 1){
                if(array[j] < array[minIndex]){
                    minIndex = j;
                }
                j++;
            }

            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }
}
