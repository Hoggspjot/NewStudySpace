import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Sol0808 {
    public static void main(String[] args) throws IOException {

        FileInputStream inputStream = new FileInputStream("august/resources/text.txt");

        FileOutputStream outputStream = new FileOutputStream("august/resources/textCopy.txt");

        byte[] buffer = new byte[1000];
        while (inputStream.available() > 0) {
            int count = inputStream.read(buffer);
            outputStream.write(buffer, 0, count);

        }
        inputStream.close();
        outputStream.close();
    }
}
