import java.time.LocalDateTime;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SolutionTread {
    public static void main(String[] args) {
        System.out.println(LocalDateTime.now());
        try (ExecutorService executorService = Executors.newFixedThreadPool(2)) {
            System.out.println(LocalDateTime.now());
            executorService.submit(() -> System.out.println("Поток1"));
            System.out.println(LocalDateTime.now());
            executorService.submit(() -> System.out.println("Поток2"));
        }


    }
}
