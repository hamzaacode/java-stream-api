package IntermediateOperations.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapOperations {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        //  square each number
        List<Integer> squaredNumbers = numbers.stream()
                .map(number -> number * number)
                .collect(Collectors.toList());

        System.out.println("Original Numbers: " + numbers);
        System.out.println("Squared Numbers: " + squaredNumbers);


        List<String> names = Arrays.asList("Amir", "Hamza", "Amir", "Java", "Stream", "API", "Spring");

        // 2. map (Function<T, R>)
        List<Integer> nameLengths = names.stream()
                .map(String::length) // Function<String, Integer>
                .collect(Collectors.toList());

        System.out.println("Names Lengths: " + nameLengths);

        // count each words character

       List<Long> wordsCharCount= names.stream()
                .map(name->name.toLowerCase().chars().count())
                .collect(Collectors.toList());

       System.out.println("Words Char Count: " + wordsCharCount);

    }

}
