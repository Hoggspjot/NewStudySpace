package Factory;

public class BirthdaySet implements BirthdayFactory{

    public Cake takeCake() {
        return new SmallCake();
    }

    public AdultCard takeCard() {
        return new AdultCard();
    }

    public AdultBook takeGift() {
        return new AdultBook();
    }
}
