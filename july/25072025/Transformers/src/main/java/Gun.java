public class Gun {
    private int ammo;

    Gun(int ammo) {
        this.ammo = ammo;
    }

    public void reload() {
        ammo = 10;
    }

    public void fire() {
        ammo--;
    }

    public int getAmmo() {
        return ammo;
    }
}
