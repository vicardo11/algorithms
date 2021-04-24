public class MergeSort {

    static void sort(int[] array, int l, int r) {
        if (l < r) {
            int m = l + (r - l) / 2;

            sort(array, l, m);
            sort(array, m + 1, r);

            merge(array, l, m, r);
        }
    }

    private static void merge(int[] array, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        int[] left = new int[n1];
        int[] right = new int[n2];

        for (int i = 0; i < n1; ++i) {
            left[i] = array[l + i];
        }

        for (int j = 0; j < n2; ++j) {
            right[j] = array[m + j + 1];
        }

        int i = 0;
        int j = 0;

        int k = l;
        while (i < n1 && j < n2){
            if(left[i] <= right[j]){
                array[k] = left[i];
                i++;
            } else {
                array[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < n1){
            array[k] = left[i];
            i++;
            k++;
        }

        while (j < n2){
            array[k] = right[j];
            j++;
            k++;
        }
    }
}
