public class Main {
    public static void main(String[] args) {

        for (String x : args) {
            System.out.println(x);
            System.out.println(x.hashCode());

        }

        Person person = new Person("Bob", 30);
        System.out.println(person.hashCode());
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
