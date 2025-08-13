import Interfaces.EnergyGenerator;
import Interfaces.Scanner;
import Interfaces.Weapon;

public abstract class Transformer {
    Weapon slotWeapon;
    EnergyGenerator slotGenerator;
    Scanner slotScanner;


    public void installWeapon(Weapon weapon) {
        this.slotWeapon = weapon;
    }

    public void installGenerator(EnergyGenerator generator) {
        this.slotGenerator = generator;
    }

    public void installScanner(Scanner scanner) {
        this.slotScanner = scanner;
    }
}

