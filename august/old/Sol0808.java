package old;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Sol0808 {
    public static void main(String[] args) throws IOException {

        FileInputStream inputStream = new FileInputStream("august/old.resources/text.txt");
        FileOutputStream outputStream = new FileOutputStream("august/old.resources/textCopy.txt");

        if (inputStream.available() > 0) {
            byte[] buffer = new byte[inputStream.available()];
            int count = inputStream.read(buffer);
            outputStream.write(buffer, 0, count);
        }
        inputStream.close();
        outputStream.close();
    }
}
