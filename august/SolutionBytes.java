import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;

public class SolutionBytes {
    public static void main(String[] args) throws IOException {


        FileInputStream inputStream = new FileInputStream("august/resources/testSource/file1.txt");
        FileOutputStream outputStream2 = new FileOutputStream("august/resources/testSource/file2.txt");
        FileOutputStream outputStream3 = new FileOutputStream("august/resources/testSource/file3.txt");

        if (inputStream.available() > 0) {
            byte[] buffer = new byte[inputStream.available()];
            int count = inputStream.read(buffer);
//            for (int i = 0; i < buffer.length; i++) {
//                System.out.println(buffer[i]);
//            }
            if (count % 2 == 0) {
                outputStream2.write(buffer, 0, (count / 2));
                System.out.println(buffer[11]);
                outputStream3.write(buffer, 0, count);
            } else {
                outputStream2.write(buffer, 0, ((count + 1) / 2));
                outputStream3.write(buffer,((count + 1) / 2), count);
            }

        }

        inputStream.close();
        outputStream2.close();
        outputStream3.close();
    }
}