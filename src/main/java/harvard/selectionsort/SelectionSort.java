package harvard.selectionsort;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] data = {1, 2, 3, 34, 5, 3, 12, 7, 9, 5, 8, 14, 16};
        System.out.println(Arrays.toString(sort(data)));
    }

    public static int[] sort(int[] data) {
        int smallest;
        for (int i = 0; i < data.length - 1; i++) {
            smallest = i;
            for (int index = i + 1; index < data.length; index++) {
                if (data[index] < data[smallest])
                    smallest = index;
            }

            int temporary = data[i];
            data[i] = data[smallest];
            data[smallest] = temporary;
        }
        return data;
    }
}
