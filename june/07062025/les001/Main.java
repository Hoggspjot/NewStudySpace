package les001;

public class Main {
    public static void main(String[] args) {

        char[] array = new char[10];
        for (Character a : array) {
            System.out.print(a +" ");
        }
        Man man = new Man(19);
        System.out.println(man.getAge() >=18 ? true : false );

    }
}


class Man {

    private int age;

    public Man(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}