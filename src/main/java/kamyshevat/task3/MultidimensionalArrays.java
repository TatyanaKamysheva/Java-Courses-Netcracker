package kamyshevat.task3;

public class MultidimensionalArrays {

    public static void main(String[] args) {
      /*  //Создать двумерный массив размером 8 на 8.
        //Заполнить его случайными числами в диапазоне [1;99]
        // Вычислить и вывести на экран сумму и произведение элементов главной и побочной диагонали

        int[][] array = new int[8][8];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = 1 + (int) (Math.random() * 99);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        int sum = 0;
        long composition = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if ((i == j) || (i + j == array.length - 1)) {
                    sum += array[i][j];
                    composition *= array[i][j];
                }
            }
        }
        System.out.println(sum + "  " + composition);*/


        //Создать двумерный массив из 8 строк и 5 столбцов.
        // Заполнить его случайными числами в отрезке [-99;99]. Вывести массив на экран.
        // Вывести на экран значение и индексы максимального (по всем строкам и столбцам) элемента в массиве.
        /*int[][] array1 = new int[8][5];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 5; j++) {
                array1[i][j] = -99 + (int) (Math.random() * 199);
                System.out.print(array1[i][j] + " ");
            }
            System.out.println();
        }
        int max = array1[0][0];
        int maxi = 0;
        int maxj = 0;

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 5; j++) {
            if(array1[i][j]>max) {
                max=array1[i][j];
                maxi=i;
                maxj=j;
            }
            }

        }
        System.out.println(max+"  "+ "  "+ maxi+"  "+ maxj);

        */
        //Cоздать двумерный массив из 8 строк и 5 столбцов из случайных целых чисел в отрезке [-10;10].
        //Вывести массив на экран.
        //Определить и вывести  на экран индекс строки с наибольшим по модулю произведением элементов.
        /*int[][] array2 = new int[8][5];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 5; j++) {
                array2[i][j] = -10 + (int) (Math.random() * 21);
                System.out.print(array2[i][j] + " ");
            }
            System.out.println();
        }
        int comp = 0;
        int max=0;
        int idx = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 5; j++) {
                comp *=Math.abs(array2[i][j]);
            }
            if(comp>=max){ max=comp; idx=i;}
        }
        System.out.println(idx);
*/
        //Создать двумерный массив из 10 строк и 7 столбцов из целых чисел в отрезке [0;100].
        //Вывести массив на экран. Отсортировать каждую строку в порядке убывания. Вывести преобразованный массив на экран.
        int[][] array3 = new int[10][7];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 7; j++) {
                array3[i][j] = (int) (Math.random() * 101);
                System.out.print(array3[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

        for (int i[] : array3) {
            i = bubbleSort(i);
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(array3[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[] bubbleSort(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] < array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        return array;
    }

}
