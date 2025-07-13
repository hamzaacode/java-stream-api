package IntermediateOperations.others;

import java.util.*;
import java.util.stream.*;

public class OthersStreamOperations {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Amir", "Hamza", "Amir", "Java", "Stream", "API", "Spring");

        // 6. distinct() (no FI, uses equals)
        List<String> distinctNames = names.stream()
                .distinct()
                .collect(Collectors.toList());

        // 7. limit(long n) (no FI)
        List<String> limited = names.stream()
                .limit(3)
                .collect(Collectors.toList());

        // 8. skip(long n) (no FI)
        List<String> skipped = names.stream()
                .skip(2)
                .collect(Collectors.toList());

        // 9. peek(Consumer<T>)
        List<String> debugged = names.stream()
                .peek(name -> System.out.println("Debug: " + name)) // Consumer<String>
                .collect(Collectors.toList());
    }
}