import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class sol10000 {
    public static void main(String[] args) throws DownloadException {


        try (FileInputStream inputStream = new FileInputStream("resources/bigFiles/small.txt")) {
            int length = inputStream.available();
            if (length < 1000) {
                throw new DownloadException();
            }
            byte[] buffer = new byte[inputStream.available()];
            System.out.println(buffer.length);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }




    }

    public static class DownloadException extends Exception {

    }
}
