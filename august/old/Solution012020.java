package old;

import java.io.FileInputStream;
import java.io.IOException;

public class Solution012020 {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream("C:\\githowto\\data.txt");
        long sum = 0;
        while (inputStream.available() > 0) {
            int data = inputStream.read();
            sum+= data;
        }
        inputStream.close();
        System.out.println(sum);
    }

}
