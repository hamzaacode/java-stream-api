package IntermediateOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterExample {
    public static void main(String[] args) {

        //  Stream<T> filter(Predicate<? super T> predicate)

        // Create a list of numbers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Use the stream API to filter out even numbers
        List<Integer> evenNumbers = numbers.stream()
                .filter(number -> number % 2 == 0) // Lambda expression for the filter condition
                .collect(Collectors.toList()); // Collect the filtered elements into a new list

        // Print the filtered even numbers
        System.out.println("Even numbers: " + evenNumbers);
    }
}
