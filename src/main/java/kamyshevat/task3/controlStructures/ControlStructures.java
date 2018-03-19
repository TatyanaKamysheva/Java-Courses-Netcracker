package kamyshevat.task3.controlStructures;

public class ControlStructures {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        switchCase(MyEnum.ALEXANDER);
        long estimatedTime1 = System.nanoTime() - startTime;

        startTime = System.nanoTime();
        ifelse(MyEnum.ALEXANDER);
        long estimatedTime2 = System.nanoTime() - startTime;

        //конструкция if-else быстрее
        System.out.println(estimatedTime1 + "   " + estimatedTime2);

    }

    public static void switchCase(MyEnum name) {
        switch (name) {
            case SERGEY:
                System.out.println("Sergey");
                break;
            case PAVEL:
                System.out.println("Pavel");
                break;
            case MAXIM:
                System.out.println("Maxim");
                break;
            case ILYA:
                System.out.println("Ilya");
                break;
            case MARK:
                System.out.println("Mark");
                break;
            case DAVID:
                System.out.println("David");
                break;
            case DENIS:
                System.out.println("Denis");
                break;
            case ALEXEY:
                System.out.println("Alexey");
                break;
            case ANDREW:
                System.out.println("Andrew");
                break;
            case KIRILL:
                System.out.println("Kirill");
                break;
            case NIKITA:
                System.out.println("Nikita");
                break;
            case DMITRIY:
                System.out.println("Dmitriy");
                break;
            case MICHAEL:
                System.out.println("Michael");
                break;
            case ALEXANDER:
                System.out.println("Alexander");
                break;
            case STANISLAV:
                System.out.println("Stas");
                break;
            default:
                break;
        }
    }

    public static void ifelse(MyEnum name) {
        if (MyEnum.SERGEY == name) System.out.println("Sergey");
        else if (MyEnum.PAVEL == name) System.out.println("Pavel");
        else if (MyEnum.MAXIM == name) System.out.println("Maxim");
        else if (MyEnum.ILYA == name) System.out.println("Ilya");
        else if (MyEnum.MARK == name) System.out.println("Mark");
        else if (MyEnum.DAVID == name) System.out.println("David");
        else if (MyEnum.DENIS == name) System.out.println("Denis");
        else if (MyEnum.ALEXEY == name) System.out.println("Alexey");
        else if (MyEnum.ANDREW == name) System.out.println("Andrew");
        else if (MyEnum.KIRILL == name) System.out.println("Kirill");
        else if (MyEnum.NIKITA == name) System.out.println("Nikita");
        else if (MyEnum.DMITRIY == name) System.out.println("Dmitriy");
        else if (MyEnum.MICHAEL == name) System.out.println("Michael");
        else if (MyEnum.ALEXANDER == name) System.out.println("Alexander");
        else if (MyEnum.STANISLAV == name) System.out.println("Stas");
        else System.out.println("-");
    }
}
