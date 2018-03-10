package kamyshevat.task2;

public class Ball {
    private float x;
    private float y;
    private float xDelta;
    private float yDelta;
    private int radius;

    public Ball(float x, float y, int radius, int speed, int direction) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        if (direction > 180 || direction < -180) direction = 180;
        this.xDelta = (float) (speed * Math.cos(direction));
        this.yDelta = (float) ((-1) * speed * Math.sin(direction));
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getxDelta() {
        return xDelta;
    }

    public void setxDelta(float xDelta) {
        this.xDelta = xDelta;
    }

    public float getyDelta() {
        return yDelta;
    }

    public void setyDelta(float yDelta) {
        this.yDelta = yDelta;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void move() {
        x += xDelta;
        y += yDelta;
    }

    public void reflectHorizontal() {
        xDelta = (-1) * xDelta;
    }

    public void reflectVertical() {
        yDelta = (-1) * yDelta;
    }

    @Override
    public String toString() {
        return "Ball[(" + x + "," + y + "), speed=(" + xDelta + "," + yDelta + ")]";
    }
}
