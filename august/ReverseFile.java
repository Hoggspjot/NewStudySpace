import java.io.*;

public class ReverseFile {
    public static void main(String[] args) throws IOException {


        FileInputStream inputStream = new FileInputStream("resources/reverse/sourceFile.txt");
        FileOutputStream outputStream = new FileOutputStream("resources/reverse/copyFile.txt");

        while (inputStream.available() > 0) {
            byte[] buffer = new byte[inputStream.available()];
            int count = inputStream.read(buffer);
            byte[] revert = new byte[buffer.length];
            for (int i = 0, j = buffer.length - 1; i < buffer.length && j >= 0 ; i++, j--) {
                revert[j] = buffer[i];
            }
            outputStream.write(revert, 0, count);

        }


        inputStream.close();
        outputStream.close();
    }
}



