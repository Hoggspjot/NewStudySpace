

import java.util.concurrent.CopyOnWriteArrayList;

public class Solution2 {
    public static void main(String[] args) {

        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();

        Thread thread = new Thread(() ->
        {
            for (int i = 0; i < 10; i++) {
                list.add(i);
            }
        });
        System.out.println(list);
        thread.start();
        thread.run();
        System.out.println(list);
    }
}
