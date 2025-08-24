import java.util.ArrayList;
import java.util.List;

public class Main2408 {
    public static void main(String[] args) {


        Box<String> stringBox = new Box<>("Hello");
        Box<Integer> integerBox = new Box<>(1);
        String str = stringBox.getValue();
        Integer in = integerBox.getValue();

        Integer[] array = {1, 2, 3};
        printArray(array);
    }

    public static <T> void printArray(T[] array) {

        for (T element : array) {
            System.out.println(element);
        }


        List<String> names = new ArrayList<>();
        names.add("Bob");
        names.add("mike");
        List<? extends CharSequence> charSeqlist  = names;
        CharSequence c = charSeqlist.get(0);
        System.out.println(c);
    }
}


class Box<T> {
    private T value;


    public Box(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}



