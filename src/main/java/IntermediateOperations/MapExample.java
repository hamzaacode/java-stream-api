package IntermediateOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapExample {

  //<R> Stream<R> map(Function<? super T, ? extends R> mapper)
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Using map to square each number in the list
        List<Integer> squaredNumbers = numbers.stream()
                .map(number -> number * number)
                .collect(Collectors.toList());

        System.out.println("Original Numbers: " + numbers);
        System.out.println("Squared Numbers: " + squaredNumbers);
    }
}
