import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ListOfMaxBytes {
    public static void main(String[] args) throws Exception {
        List<Integer> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileInputStream inputStream = new FileInputStream(fileName);

        while (inputStream.available() > 0) {
            list.add(inputStream.read());
        }
        inputStream.close();

        Map<Integer, Long> map = list.stream()
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ));
        Long max = map.values().stream()
                .max(Comparator.naturalOrder())
                .orElse(0L);

        List<Integer> listOfmax = map.entrySet().stream()
                .filter(entry -> entry.getValue().equals(max))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        for (Integer s : listOfmax) {
            System.out.print(s+" ");
        }
    }
}
