import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test123123 {
    public static String name1 = "Лена";
    public static String name2 = "Оля";

    public static void main(String[] args) throws InterruptedException {

    Thread thread1 = new Thread(new Swapper(name1, name2));

    Thread thread2 = new Thread(new Swapper(name1, name2));


    thread1.start();
    thread2.start();

    thread1.join();
    thread2.join();


    }



    public static class Swapper implements Runnable {
        private String name1;
        private String name2;
        private String temp;
        static Map<Integer, List<String>> map = new HashMap<>();


        public Swapper(String name1, String name2) {
            this.name1 = name1;
            this.name2 = name2;
        }

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                temp = name1;
                name1 = name2;
                name2 = temp;
                synchronized (map){
                    System.out.println("круг номер - " + i);
                    System.out.println("-----------------------------------------");
                    map.put(i, List.of(name1,name2));
                }
            }
            Swapper.print(map);
            }
            public static void print(Map<Integer,List<String>> map) {
                for (Map.Entry<Integer, List<String>> entry : map.entrySet()) {
                    System.out.println(entry.getKey()+" :["+entry.getValue().toString()+"]");
                }
            }
        }
    }


