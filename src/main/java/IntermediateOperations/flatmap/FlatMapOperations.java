package IntermediateOperations.flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapOperations {
    List<String> names = Arrays.asList("Amir", "Hamza", "Amir", "Java", "Stream", "API", "Spring");

    // 3. flatMap (Function<T, Stream<R>>)
    List<String> splitWords = names.stream()
            .flatMap(name -> Arrays.stream(name.split(""))) // Function<String, Stream<String>>
            .collect(Collectors.toList());
}
