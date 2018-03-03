package kamyshevat.task1;

public class MyTriangle {
    MyPoint v1 = new MyPoint();
    MyPoint v2 = new MyPoint();
    MyPoint v3 = new MyPoint();


    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        v1.setXY(x1, y1);
        v2.setXY(x2, y2);
        v3.setXY(x3, y3);
    }

    @Override
    public String toString() {
        return "MyTriangle[v1=" + v1.toString() + ", v2=" + v2.toString() + ", v3=" + v3.toString() + "]";
    }

    public double getPerimeter() {
        double a = v1.distance(v2);
        double b = v2.distance(v3);
        double c = v3.distance(v1);
        if (a < 0 || b < 0 || c < 0) {
            return -1;
        }
        if (((a + b) > c) && ((a + c) > b) && ((b + c) > a)) {
            return a + b + c;
        } else {
            return -1;
        }
    }

    public String getType() {
        double a = v1.distance(v2);
        double b = v2.distance(v3);
        double c = v3.distance(v1);

        if ((a == b) && (b == c)) {
            return "Equilateral";
        } else if ((a == b) || (b == c) || (c == a)) {
            return "Isosceles";
        } else return "Scalene";
    }
}
