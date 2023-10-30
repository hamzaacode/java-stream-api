import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Stream<Integer> stream = Main.streamCreation();
    }

    private static Stream<Integer> streamCreation() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        return numbers.stream();
    }
}
