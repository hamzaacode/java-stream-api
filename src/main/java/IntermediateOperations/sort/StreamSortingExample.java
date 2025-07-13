package IntermediateOperations.sort;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSortingExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 1, 9, 3, 7);

//        List<Integer> sortedNumbers = numbers.stream()
//            .sorted() // Ascending order
//            .collect(Collectors.toList());
//
//        List<Integer> reverseSortedNumbers = numbers.stream()
//            .sorted((a, b) -> b - a) // Descending order
//            .collect(Collectors.toList());

       List<Integer> sortedNumbers=numbers.stream().sorted((a,b)->a-b).collect(Collectors.toList());
       List<Integer> reverseSortedNumbers=numbers.stream().sorted((a,b)->b-a).collect(Collectors.toList());

        System.out.println("Ascending: " + sortedNumbers);
        System.out.println("Descending: " + reverseSortedNumbers);
    }
}