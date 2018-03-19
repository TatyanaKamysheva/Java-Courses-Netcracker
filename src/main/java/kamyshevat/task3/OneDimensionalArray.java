package kamyshevat.task3;

public class OneDimensionalArray {
    public static void main(String[] args) {
        //Создать массив нечётных чисел от 1 до 99 и вывести их в порядке возрастания и убывания
        int size = 0;
        for (int i = 1; i <= 99; i++) {
            if (i % 2 != 0) size++;
        }
        int[] array = new int[size];
        for (int i = 1, b = 0; i <= 99; i++) {
            if (i % 2 != 0) {
                array[b] = i;
                System.out.print(array[b] + " ");
                b++;
            }
        }
        System.out.println();
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        //Создать массив из 20 случайных чисел лежащих в отрезке [0;10]. Вывести массив на экран
        //Подсчитать и вывести на экран количество чётных и нечётных элементов в массиве.
        int[] array1 = new int[20];
        byte count_even = 0;
        byte count_uneven = 0;
        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) (Math.random() * 11);
            System.out.print(array1[i] + " ");
            if (array1[i] % 2 == 0) {
                count_even++;
            } else count_uneven++;
        }
        System.out.println("\n" + count_even + "  " + count_uneven);


        //Создайте массив из 10 случайных целых чисел на  отрезке [1;100].
        // Выведите массив на экран в строку. Замените каждый элемент с нечётным индексом на ноль.
        // Выведите новый результат на экран.
        int[] array2 = new int[10];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = (int) (Math.random() * 101);
            System.out.print(array2[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < array2.length; i++) {
            if (i % 2 != 0) {
                array2[i] = 0;
            }
            System.out.print(array2[i] + " ");
        }


        //Создайте массив из 15 случайных целых чисел из отрезка [-50;50].
        // Найдите максимальный и минимальный элемент массива.
        // Выведите их значения на экран и также индекс последнего вхождения элемента в массив.
        int[] array3 = new int[15];

        for (int i = 0; i < array3.length; i++) {
            array3[i] = -51 + (int) (Math.random() * 101);
            System.out.print(array3[i] + " ");
        }
        int min = array3[0];
        int minid = 0;
        int max = array3[0];
        int maxid = 0;
        System.out.println();
        for (int i = 1; i < array3.length; i++) {
            if (array3[i] >= max) {
                max = array3[i];
                maxid = i;
            }
            if (array3[i] <= min) {
                min = array3[i];
                minid = i;
            }
        }
        System.out.println("\n" + max + "   " + maxid + "  " + min + "  " + minid);


        //Создайте два  массива из 10 случайных целых чисел в отрезке [0;10].
        // выведите массивы. Вычислите среднее арифметическое элементов каждого массива и сообщите,
        // для какого из массивов это значение оказалось больше (либо сообщите, что они равны).
        int[] array4 = new int[10];
        int[] array5 = new int[10];
        double arif4 = 0;
        double arif5 = 0;
        for (int i = 0; i < array4.length; i++) {
            array4[i] = (int) (Math.random() * 11);
            array5[i] = (int) (Math.random() * 11);
        }
        for (int i = 0; i < array4.length; i++) {
            System.out.print(array4[i] + "  ");
            arif4 += array4[i];
        }
        for (int i = 0; i < array4.length; i++) {
            System.out.print(array5[i] + "  ");
            arif5 += array5[i];
        }

        if (arif4 > arif5) System.out.println("first array");
        if (arif4 < arif5) System.out.println("second array");
        if (arif4 == arif5) System.out.println("equals");


/*Создайте массив из 20 случайных целых чисел в отрезке [-1;1]
Определите какой элемент встречается в массиве чаще всего и выведите его на экран.
Также если несколько элементов встречаются одинаковое количество раз, необходимо их вывести на экран.*/
        int[] array6 = new int[20];
        byte count_one_m = 0;
        byte count_one = 0;
        byte count_zero = 0;
        for (int i = 0; i < array6.length; i++) {
            array6[i] = -1 + (int) (Math.random() * 3);
            if (array6[i] == -1) count_one_m++;
            if (array6[i] == 0) count_zero++;
            if (array6[i] == 1) count_one++;
        }
        if (count_one > count_one_m && count_one > count_zero) {
            System.out.println("1");
        } else if (count_one == count_one_m && count_one == count_zero) {
            System.out.println("1 0 -1");
        } else if (count_one == count_zero) {
            System.out.println("1 0");
        } else if (count_one == count_one_m) {
            System.out.println("1 -1");
        } else if (count_one_m == count_zero) {
            System.out.println("0 -1");
        } else if (count_zero > count_one && count_zero > count_one_m) {
            System.out.println("0");
        } else if (count_one_m > count_zero && count_one_m > count_one) {
            System.out.println("-1");
        }

    }
}

