

public class Main {
    public static void main(String[] args) {

        Transformer optimus = new Transformer(1);
        System.out.println(optimus.getX());
        optimus.run();
        System.out.println(optimus.getX());
        optimus.run();
        System.out.println(optimus.getX());

        System.out.println(optimus.gun_left.getAmmo());
        System.out.println(optimus.gun_right.getAmmo());

        optimus.fire();

        System.out.println(optimus.gun_left.getAmmo());
        System.out.println(optimus.gun_right.getAmmo());

    }
}

