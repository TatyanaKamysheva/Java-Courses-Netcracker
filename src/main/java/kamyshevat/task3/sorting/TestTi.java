package kamyshevat.task3.sorting;

public class TestTi {


    public static void main(String[] args) {

        // Sort arrays by different methods
        SortArray sortArray = new SortArray();
        System.out.println(sortArray.toString());

        long startTime = System.nanoTime();
        sortArray.selectSort();
        long estimatedTime1 = System.nanoTime() - startTime;

        startTime = System.nanoTime();
        sortArray.bubbleSort();
        long estimatedTime2 = System.nanoTime() - startTime;

        startTime = System.nanoTime();
        sortArray.sortByArrayClass();
        long estimatedTime3 = System.nanoTime() - startTime;

        System.out.println("select sort " + estimatedTime1 + " bubble sort " + estimatedTime2 + "  ArrayClass sort " + estimatedTime3);

        //having small sizes it is more reasonable to use a select sort or a bubble sort;
        // having a large array - Arrays.sort()
    }
}
