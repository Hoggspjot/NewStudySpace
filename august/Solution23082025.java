import java.util.ArrayList;
import java.util.List;

public class Solution23082025 {

    {
        System.out.println("Hello");
    }

    static {
        System.out.println("Static hello");
    }

    private int number;

    public static void main(String[] args) throws ClassNotFoundException {
        int number;

        int[] array = new int[]{1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 5};

        char a = 64;
        System.out.println(a);

        List<Character> list = new ArrayList<>();

        for (char i = 0; i < 1000; i++) {
            list.add(i);
        }


        Class classs =  Class.forName("Sol002");
        try {
            System.out.println((classs.getConstructor()));
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }

        char base ='\u0000';
        System.out.println(base);



    }
}

record userDTO(int ID,
               String name) {

}