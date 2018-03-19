package kamyshevat.task3.factorial;

public class TestTime {

    // factorial calculation by different methods
    public static void main(String[] args) {
        int n = 1000;
        Factorial factorial = new Factorial();
        long startTime = System.nanoTime();
        factorial.byRecursion(n);
        long estimatedTime1 = System.nanoTime() - startTime;

        startTime = System.nanoTime();
        factorial.byCycle(n);
        long estimatedTime2 = System.nanoTime() - startTime;

        System.out.println(estimatedTime1 + " " + estimatedTime2);
        //calculation by cycle is better
    }
}
