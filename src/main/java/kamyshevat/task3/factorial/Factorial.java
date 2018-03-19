package kamyshevat.task3.factorial;

public class Factorial {

    public long byCycle(long num) {
        long result = 1;
        for (int i = 1; i <= num; ++i) result *= i;
        return result;
    }

    public long byRecursion(long num) {
        return (num == 0) ? 1 : num * byRecursion(num - 1);
    }
}
