package kamyshevat.task3.sorting;

import java.util.Arrays;

public class SortArray {
    static int n = 10000;
    static int[] array_source = new int[n];

    public SortArray() {
        for (int i = 0; i < n; i++) {
            array_source[i] = (int) (Math.random() * 100);
        }
    }

    public void bubbleSort() {
        int[] array = Arrays.copyOf(array_source, array_source.length);
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
    }

    public void selectSort() {
        int[] array = Arrays.copyOf(array_source, array_source.length);
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int min_i = i;
            for (int j = i + 1; j < array.length; j++) {
                //Если находим, запоминаем его индекс
                if (array[j] < min) {
                    min = array[j];
                    min_i = j;
                }
            }
            if (i != min_i) {
                int tmp = array[i];
                array[i] = array[min_i];
                array[min_i] = tmp;
            }
        }
    }

    public void sortByArrayClass() {
        int[] array = Arrays.copyOf(array_source, array_source.length);
        Arrays.sort(array);
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < array_source.length; i++) {
            result += array_source[i] + " ";
        }
        return result;
    }
}



