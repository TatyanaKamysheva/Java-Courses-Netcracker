package kamyshevat.task1;

public class Main {
    public static void main(String[] args) {
        /*Circle circle1=new Circle();
        Circle circle2=new Circle(12, "blue");
        Circle circle3=new Circle(12);
        System.out.println(circle1.getColor());
        System.out.println(circle2.getRadius());
        System.out.println(circle1.getArea());
        System.out.println(circle3.toString());*/

        /*Rectangle rectangle1=new Rectangle();
        Rectangle rectangle2=new Rectangle(10,11);
        System.out.println(rectangle1.getArea());
        System.out.println(rectangle1.getLength());
        System.out.println(rectangle2.getPerimeter());
        System.out.println(rectangle2.getWidth());
        System.out.println(rectangle2.toString());*/

        /*Employee employee = new Employee(1, "first", "last", 10000);
        System.out.println(employee.getName());
        System.out.println(employee.getAnnualSalary());
        System.out.println(employee.toString());
        System.out.println(employee.raiseSalary(15));
        System.out.println(employee.getSalary());*/


        /*Author[] authors=new Author[]{new Author("King","king@mail.ru",'m'),new Author("Kollins", "kol@mail.ru",'f')};
        Book book=new Book("It",authors,100,1);
        System.out.println(book.getAuthors());
        System.out.println(book.getAuthorName());
        System.out.println(book.toString());*/

       /* MyPoint myPoint = new MyPoint(2, 2);
        MyPoint myPoint1 = new MyPoint(4, 4);
        System.out.println(myPoint.distance());
        System.out.println(myPoint.distance(4, 4));
        System.out.println(myPoint.distance(myPoint1));
        System.out.println(myPoint.getXY());
        System.out.println(myPoint.toString());*/

        MyPoint myPoint1 = new MyPoint(0, 0);
        MyPoint myPoint2 = new MyPoint(0, 1);
        MyPoint myPoint3 = new MyPoint(1, 0);

        //MyTriangle myTriangle= new MyTriangle(myPoint1, myPoint2,myPoint3);
        MyTriangle myTriangle = new MyTriangle(0, 0, 0, 1, 1, 0);

        System.out.println(myTriangle.toString());
        System.out.println(myTriangle.getPerimeter());
        System.out.println(myTriangle.getType());

    }
}
