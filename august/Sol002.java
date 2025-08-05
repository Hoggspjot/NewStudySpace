import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Sol002 {
    public static void main(String[] args) throws IOException {

        FileInputStream inputStream = new FileInputStream("C:\\githowto\\data.txt");

        FileOutputStream outputStream = new FileOutputStream("C:\\githowto\\dataCopy.txt");

        while (inputStream.available() > 0) {
            int data = inputStream.read();
            outputStream.write(data);
        }
        inputStream.close();
        outputStream.close();
        System.out.println("ready");

    }
}
