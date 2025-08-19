package IntermediateOperations.sort;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortingOperations {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Amir", "Hamza", "Amir", "Java", "Stream", "API", "Spring");
        // 4. sorted() (natural order)
        List<String> sortedNames = names.stream()
                .sorted()
                .collect(Collectors.toList());

        // 5. sorted(Comparator<T>)
        List<String> reverseSorted = names.stream()
                .sorted((a, b) -> b.compareTo(a)) // Comparator<String>
                .collect(Collectors.toList());

      //  names.stream().sorted()


    }
}
