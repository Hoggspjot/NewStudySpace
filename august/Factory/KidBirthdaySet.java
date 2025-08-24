package Factory;

public class KidBirthdaySet implements BirthdayFactory {

    public BigCake takeCake() {
        return new BigCake();
    }

    public KidCard takeCard() {
        return new KidCard();
    }

    public Kandy takeGift() {
        return new Kandy();
    }
}
