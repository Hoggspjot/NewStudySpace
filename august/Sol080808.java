import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Sol080808 {
    public static void main(String[] args) throws IOException {

        FileInputStream inputStream = new FileInputStream("august/resources/textZAP.txt");
        int count = 0;
        while (inputStream.available() > 0) {
            if ((inputStream.read() == 44)) {
                count++;
            }
        }
        System.out.println(count);


    }
}
