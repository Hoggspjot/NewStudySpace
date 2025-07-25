import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        String filePath = "22062025\\File.txt";

        try (Scanner scanner = new Scanner(System.in);
             OutputStream outputStream = new FileOutputStream(filePath);
             Writer writer = new OutputStreamWriter(outputStream);
             BufferedWriter bufferedWriter = new BufferedWriter(writer);
        ) {
            System.out.println("Введи текст ");
            String str;
            while (!(str = scanner.nextLine()).equals("exit")) {
                bufferedWriter.append(str).append("\n");
            }

         }

        try (InputStream inputStream = new FileInputStream(filePath);
            InputStreamReader reader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(reader)
        ) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        }

    }
}
