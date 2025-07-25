import java.util.concurrent.Semaphore;

public class Semaph {
    public static void main(String[] args) {

        Semaphore sem = new Semaphore(2);
        new Philosopher(sem,"Сократ").start();
        new Philosopher(sem,"Платон").start();
        new Philosopher(sem,"Аристотель").start();
        new Philosopher(sem,"Фалес").start();
        new Philosopher(sem,"Пифагор").start();


    }
}


class Philosopher extends Thread {
    private Semaphore sem;
    private String name;
    private boolean eat = false;


    public Philosopher(Semaphore sem, String name) {
        this.sem = sem;
        this.name = name;
    }


    @Override
    public void run() {

        if (!eat) {
            try {
                sem.acquire();
                System.out.println("Разрешение получено для " + name);
                Thread.sleep(300);
                eat = true;
                System.out.println(name + " поел");
                System.out.println("Разрешение возвращено");
                sem.release();
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }



        }
    }
}

