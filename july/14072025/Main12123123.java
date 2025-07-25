public class Main12123123 {
    public static void main(String[] args) throws InterruptedException {
        Synch synch = new Synch();

        Thread thread1 = new Thread(() ->{
            synch.counter();
        });

        Thread thread2 = new Thread(() ->{
            synch.counter();
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(synch.getCount());
    }
}


class Synch extends Thread {
    private int count;

    public synchronized int counter() {
        for (int i = 0; i < 100; i++) {
            count++;
        }
        return count;
    }

    public int getCount() {
        return count;
    }
}

