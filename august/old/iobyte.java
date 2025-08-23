package old;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
Максимальный байт
*/

public class iobyte {
    public static void main(String[] args) throws Exception {
        List<Integer> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        FileInputStream inputStream = new FileInputStream(fileName);

        while (inputStream.available() > 0) {
            list.add(inputStream.read());
        }
        inputStream.close();
        Integer max = list.stream()
                .max((i1, i2) -> i1 - i2)
                .orElse(0);
        System.out.println(max);
    }
}
