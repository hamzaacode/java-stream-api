package IntermediateOperations.filter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FilterOperations {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Apple", "Orange", "Banana", "Mango");

        // Start with A
        List<String> startWithAList = list.stream()
                .filter(s -> s.startsWith("A"))
                .collect(Collectors.toList());

        List<String> l2=Arrays.asList("Apple","Orange");
        l2.stream()
                .filter(s->s.length()>3)
                .collect(Collectors.toList());
        // Long name
        List<String> lingNameList = list.stream()
                .filter(s -> s.length() > 3)
                .collect(Collectors.toList());

        // Create a list of numbers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Get Even Numbers
        List<Integer> evenNumbers = numbers.stream()
                .filter(number -> number % 2 == 0) // Lambda expression for the filter condition
                .collect(Collectors.toList()); // Collect the filtered elements into a new list

        //evenNumbers.forEach(System.out::println);
        evenNumbers.forEach(num -> System.out.println(num));

        System.out.println("\n");

        // get Odd Numbers
        List<Integer> oddNumers = numbers.stream()
                .filter(num -> num % 2 != 0)
                .collect(Collectors.toList());

        oddNumers.forEach(System.out::println);

        // contain "pp"
        List<String> doublePP = list.stream()
                .filter(s -> s.toLowerCase().contains("pp"))
                .collect(Collectors.toList());

        doublePP.forEach(System.out::println);

        // count chracter
        List<String> stringHaveMoreOneA = list.stream()
                .filter(name -> name.toLowerCase().chars()
                        .filter(ch -> ch == 'a').count() > 1
                )
                .collect(Collectors.toList());

        // stringHaveMoreOneA.forEach(System.out::println);


        // find string morethan 2 vowels

        List<String> words = Arrays.asList("Stream", "Java", "Education", "Sky", "Ocean");

        List<String> wordsHaveVowelsMoreThan2 = words.stream()
                .filter(word -> word.toLowerCase().chars()
                        .filter(ch -> "aeiou".indexOf(ch) != -1).count() > 2
                )
                .collect(Collectors.toList());
        //   wordsHaveVowelsMoreThan2.forEach(System.out::println);


        //

        List<String> vList = words.stream()
                .filter(word -> getVowelsCount(word) > 2)
                .collect(Collectors.toList());

        vList.forEach(System.out::println);
//

        List<String> vList2 = words.stream()
                .filter(word -> getCount(word) > 2)
                .collect(Collectors.toList());

        vList.forEach(System.out::println);
    }

    public static long getVowelsCount(String word) {
        return word.toLowerCase().chars().filter(ch -> "aeiou".indexOf(ch) != -1).count();
    }

    public static Long getCount(String word) {
        char[] chArray = word.toLowerCase().toCharArray();
        long count = 0;
        String vowels = "aeiou";
        for (Character c : chArray) {
            if (vowels.contains(String.valueOf(c))) {
                count++;
            }
        }
        return count;
    }
}
