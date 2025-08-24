package old;

import java.lang.reflect.Field;

public class Main {

    private static Class<Point> pointClass;

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {

        Point point = new Point(1, 2);
        SupPoint supPoint = new SupPoint(3, 4, 5);

        System.out.println(point);
        System.out.println(supPoint);

        pointClass = Point.class;
       Field xa =  pointClass.getDeclaredField("field");
       System.out.println(xa.accessFlags());
        System.out.println(xa.getType());
        xa.setAccessible(true);
        Object xaxa = xa.get(null);
        System.out.println(xaxa);

    }
}


class Point {
    private static int field = 1;
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "old.Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

class SupPoint extends Point {
    private int s;


    public SupPoint(int x, int y, int s) {
        super(x, y);
        this.s = s;
    }

    public int getS() {
        return s;
    }

    public void setS(int s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return "old.SupPoint{" +
                "x=" + getX() +
                ", y=" + getY()
                + ", " +"s=" + s +
                '}';
    }
}