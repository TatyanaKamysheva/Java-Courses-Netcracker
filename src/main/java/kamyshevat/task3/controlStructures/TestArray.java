package kamyshevat.task3.controlStructures;

public class TestArray {
    static int count0 = 0, count1 = 0, count2 = 0, count3 = 0, count4 = 0, count5 = 0, count6 = 0, count7 = 0, count8 = 0, count9 = 0, count10 = 0;


    public static void main(String[] args) {
        int[] array = new int[50];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 11);
            System.out.print(array[i] + " ");
        }

        long startTime = System.nanoTime();
        for (int i = 0; i < array.length; i++) {
            switchcase(array[i]);
        }
        long estimatedTime1 = System.nanoTime() - startTime;

        startTime = System.nanoTime();
        for (int i = 0; i < array.length; i++) {
            ifelse(array[i]);
        }
        long estimatedTime2 = System.nanoTime() - startTime;

        System.out.println(estimatedTime1 + "   " + estimatedTime2);
    }

    public static void switchcase(int num) {
        switch (num) {
            case 0:
                count0++;
                break;
            case 1:
                count1++;
                break;
            case 2:
                count2++;
                break;
            case 3:
                count3++;
                break;
            case 4:
                count4++;
                break;
            case 5:
                count5++;
                break;
            case 6:
                count6++;
                break;
            case 7:
                count7++;
                break;
            case 8:
                count8++;
                break;
            case 9:
                count9++;
                break;
            case 10:
                count10++;
                break;
        }
    }

    public static void ifelse(int num) {
        if (num == 0) count0++;
        else if (num == 1) count1++;
        else if (num == 2) count2++;
        else if (num == 3) count3++;
        else if (num == 4) count4++;
        else if (num == 5) count5++;
        else if (num == 6) count6++;
        else if (num == 7) count7++;
        else if (num == 8) count8++;
        else if (num == 9) count9++;
        else if (num == 10) count10++;
    }
}
