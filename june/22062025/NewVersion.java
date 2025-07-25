import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class NewVersion {
    public static void main(String[] args) throws IOException {

        String filePath = "22062025\\NewFile.txt";
        Path path = Path.of(filePath);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи текст");
        StringBuilder text = new StringBuilder();

        String line;
        while (!(line = scanner.nextLine()).equals("exit")) {
            text.append(line).append("\n");
        }
        Files.write(path, text.toString().getBytes());


        String content = Files.readString(path);
        System.out.println(content);

    }
}
