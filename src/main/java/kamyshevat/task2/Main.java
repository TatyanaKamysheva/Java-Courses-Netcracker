package kamyshevat.task2;

public class Main {
    public static void main(String[] args) {
        Container container = new Container(0, 0, 5, 5);
        Ball ball = new Ball(3, -3, 1, 56, 23);
        System.out.println(container.collides(ball));
        System.out.println(ball.getxDelta());
        System.out.println(ball.getyDelta());
        ball.move();
        System.out.println(ball.getX());
        System.out.println(ball.getY());
        System.out.println(ball.toString());
    }
}
