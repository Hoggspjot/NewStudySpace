package less003;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list);

        Integer x = list.remove(1);

        System.out.println(list);
        System.out.println(x);
        boolean y = list.remove(Integer.valueOf(3));
        System.out.println(list);



        List<Integer> list2 = new ArrayList<>(Arrays.asList(12,3,432,4,12,12,31,23,4,645));
        System.out.println(list2.size());
        Collections.sort(list2);
        System.out.println(list2);
        Collections.shuffle(list2);
        System.out.println(list2);

    }
}
