package IntermediateOperations.map;

import java.util.List;
import java.util.stream.Collectors;

class Person {
    private String name;
    
    public Person(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
}

public class StreamMapExample {
    public static void main(String[] args) {
        // Create a list of persons
        List<Person> persons = List.of(
            new Person("Alice"),
            new Person("Bob"),
            new Person("Charlie"),
            new Person("David")
        );

        // Use Java streams to map names to a new list
        List<String> names = persons.stream()
            .map(Person::getName) // Using a method reference
            .collect(Collectors.toList());

        // Print the mapped names
        names.forEach(System.out::println);

        List<String> namesss=persons.stream()
                .map(person -> person.getName())
                .collect(Collectors.toList());
        namesss.forEach(System.out::println);
    }
}
