package old;

import java.io.*;

public class SolutionBytes {
    public static void main(String[] args) throws IOException {


        FileInputStream inputStream = new FileInputStream("resources/testSource/file1.txt");
        FileOutputStream outputStream2 = new FileOutputStream("resources/testSource/file2.txt");
        FileOutputStream outputStream3 = new FileOutputStream("resources/testSource/file3.txt");

        if (inputStream.available() > 0) {
            byte[] buffer = new byte[inputStream.available()];
            int count = inputStream.read(buffer);
            if (count % 2 == 0) {
                int half = count /2;
                outputStream2.write(buffer, 0, half);
                outputStream3.write(buffer, half, half);
            } else {
                int firstHalf = (count + 1) /2;
                int secondHalf = count - firstHalf;
                outputStream2.write(buffer, 0, firstHalf);
                outputStream3.write(buffer,firstHalf, secondHalf);
            }

        }

        inputStream.close();
        outputStream2.close();
        outputStream3.close();
    }
}