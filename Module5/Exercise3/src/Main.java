import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> numbers = new ArrayList<>();

        Instant before = Instant.now();

        for (int i = 0; i < 100_000_000; i++ ) {
            int number = random.nextInt(100_000_001);
            numbers.add(number);
        }

        Instant after = Instant.now();

        Duration duration = Duration.between(before, after);
        System.out.println(duration.toMillis());
    }
}