package kamyshevat.task3;

public class NestedCycles {
    //Реализовать программу которая выводит в консоли прямоугольник из символов #
    public static void main(String[] args) {
        int size = 5;
        for (int row = 0; row < size; row++) {
            for (int column = 0; column < size; column++) {
                System.out.print("# ");
            }
            System.out.println();
        }

        System.out.println();

        for (int row = 1; row <= size; row++) {
            for (int column = 1; column <= row; ++column) {
                System.out.print("# ");
            }
            System.out.println();
        }

        size = 7;
        System.out.println();
        for (int row = 0; row < size; row++) {
            for (int column = 0; column < size; column++) {
                if (row == 0 || row == size - 1 || column == 0 || column == size - 1 || row == column || row + column == size - 1) {
                    System.out.print("# ");
                } else System.out.print("  ");
            }
            System.out.println();
        }
    }
}
