package TerminalOperations;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamTerminalOperationsExampleWithString {
    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob", "Charlie", "David", "Eva");

        // Example 1: forEach - Perform an action for each element
        names.stream()
             .forEach(name -> System.out.println("Hello, " + name));
        names.forEach(name-> System.out.println(name));

        // Example 2: count - Count the elements in the stream
        long count = names.stream()
                         .count();
        System.out.println("Number of names: " + count);

        // Example 3: collect - Collect elements into a new data structure
        List<String> filteredNames = names.stream()
                                          .filter(name -> name.length() > 4)
                                          .collect(Collectors.toList());
        System.out.println("Names with more than 4 letters: " + filteredNames);

        // Example 4: anyMatch - Check if any element matches a condition
        boolean anyLongNames = names.stream()
                                     .anyMatch(name -> name.length() > 5);
        System.out.println("Any long names: " + anyLongNames);

        // Example 5: allMatch - Check if all elements match a condition
        boolean allShortNames = names.stream()
                                     .allMatch(name -> name.length() <= 6);
        System.out.println("All names are short: " + allShortNames);

        // Example 6: findFirst - Find the first element in the stream
        String first = names.stream()
                            .findFirst()
                            .orElse("No names found");
        System.out.println("First name: " + first);

        // Example 7: max - Find the maximum element in the stream
        String longestName = names.stream()
                                  .max(String::compareTo)
                                  .orElse("No names found");
        System.out.println("Longest name: " + longestName);

        List<Integer> numbers = List.of(10, 40, 30, 20, 50, 50);

        Optional<Integer> secondLargest = numbers.stream()
                .distinct()                 // remove duplicates
                .sorted(Comparator.reverseOrder()) // sort descending
                .skip(1)                    // skip the largest
                .findFirst();
    }
}
