package Factory;

public class Main {
    public static void main(String[] args) {

        BirthdaySet birthdaySet = new BirthdaySet();
        System.out.println(doParty(birthdaySet));

        KidBirthdaySet kidBirthdaySet = new KidBirthdaySet();
        System.out.println(doParty(kidBirthdaySet));
    }

    public static String doParty(BirthdayFactory birthdayFactory) {
        return birthdayFactory.takeCake().getName() + " и " + birthdayFactory.takeCard().getName() + " и " + birthdayFactory.takeGift().getName();
    }
}
