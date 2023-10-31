package TerminalOperations;

import java.util.List;
import java.util.stream.Collectors;

public class StreamTerminalOperationsExampleWithInteger {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // 1. forEach - Print each element
        System.out.println("forEach:");
        numbers.stream().forEach(System.out::println);

        // 2. count - Count the elements
        long count = numbers.stream().count();
        System.out.println("Count: " + count);

        // 3. collect - Collect elements into a new data structure (e.g., List, Set, Map)
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Even numbers: " + evenNumbers);

        // 4. min and max - Find the minimum and maximum element
        Integer min = numbers.stream().min(Integer::compareTo).orElse(null);
        Integer max = numbers.stream().max(Integer::compareTo).orElse(null);
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);

        // 5. reduce - Combine elements to produce a single result
        Integer sum = numbers.stream().reduce(0, (a, b) -> a + b);
        System.out.println("Sum: " + sum);

        // 6. anyMatch and allMatch - Check if any or all elements match a condition
        boolean hasEven = numbers.stream().anyMatch(n -> n % 2 == 0);
        boolean allEven = numbers.stream().allMatch(n -> n % 2 == 0);
        System.out.println("Has even number: " + hasEven);
        System.out.println("All even numbers: " + allEven);
    }
}
