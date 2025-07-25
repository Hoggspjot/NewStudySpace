import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Solution234321424 {
    public static void main(String[] args) throws InterruptedException {
        FiveThread thread = new FiveThread();
        thread.start();
        thread.join();

    }


    static class FiveThread extends Thread {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        StringBuilder sb = new StringBuilder();
        String line;

        @Override
        public void run() {

                try {
                    while (!((line = reader.readLine()).equals("exit")) &&
                            !Thread.currentThread().isInterrupted()) ;
                    sb.append(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

                System.out.println(sb);
            }
        }
    }
