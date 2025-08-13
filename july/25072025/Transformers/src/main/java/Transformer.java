


public class Transformer {
    private int x;

    Gun gun_left;
    Gun gun_right;


    public Transformer(int x) {
        this.x = x;
        gun_left = new Gun(10);
        gun_right = new Gun(10);
    }


    public void run() {
        this.x += 1;
    }

    public int getX() {
        return x;
    }

    public void fire() {
        gun_right.fire();
        gun_left.fire();
    }
}
