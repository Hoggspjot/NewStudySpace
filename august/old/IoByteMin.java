package old;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class IoByteMin {
    public static void main(String[] args) throws Exception {
        List<Integer> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        FileInputStream inputStream = new FileInputStream(fileName);

        while (inputStream.available() > 0) {
            list.add(inputStream.read());
        }
        inputStream.close();

        Integer min = list.stream()
                .min(((o1, o2) -> o1 - o2))
                .orElse(0);
        System.out.println(min);
    }
}
