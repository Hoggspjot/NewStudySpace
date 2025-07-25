package less002;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 23, 34, 435, 546, 456, 7, 5, 234, 23, 4234);
        for (Integer x : list) {
            System.out.print(x+" ");
        }
        System.out.println();

        Collections.fill(list, 10);

        for (Integer x : list) {
            System.out.print(x+" ");
        }
        System.out.println();
        Collections.replaceAll(list, 10, 20);


        for (Integer x : list) {
            System.out.print(x+" ");
        }
        System.out.println();

        Collections.sort(list);

        for (Integer x : list) {
            System.out.print(x+" ");
        }




    }
}
