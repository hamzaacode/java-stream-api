package IntermediateOperations;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestMain {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Apple", "Orange", "Banana", "Mango");
        // Create a list of numbers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        //filter -- takes predicate

        List<Integer> evenNumberList = numbers.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toList());

        List<Integer> oddNumberList = numbers.stream()
                .filter(x -> x % 2 != 0)
                .collect(Collectors.toList());

        //Map<Integer,List<Integer>> map = evenNumberList.stream().collect(Collectors.groupingBy(e->))
    }
}
