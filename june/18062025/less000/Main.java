package less000;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


    }
            //какой то шляпный метод из комментариев с джавараш , все в кучу
    public static int findMass(int a, int b) throws IOException {

        int[] array = new int[10];
        array[0] = a;
        array[1] = b;
        try (Scanner scanner = new Scanner(System.in); BufferedWriter bw = Files.newBufferedWriter(Path.of(scanner.nextLine()))) {
            Thread.sleep(240, 123);
            OptionalInt reduse = Arrays.stream(array).reduce(Math::max);
            Integer getIng = reduse.getAsInt();
            String str = getIng.toString();
            bw.write(str);
            return getIng;
        } catch (Exception e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException(e);
        }


    }
}
