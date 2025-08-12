import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseFile {
    public static void main(String[] args) throws IOException {


        FileInputStream inputStream = new FileInputStream("resources/reverse/sourceFile.txt");
        FileOutputStream outputStream = new FileOutputStream("resources/reverse/copyFile.txt");

        List<Integer> readBytes = new ArrayList<>();
        while (inputStream.available() > 0) {
            readBytes.add(inputStream.read());
        }
        Collections.reverse(readBytes);
        for (Integer bytes : readBytes) {
            outputStream.write(bytes);
        }


        inputStream.close();
        outputStream.close();
    }
}



