package IntermediateOperations.sort;

import IntermediateOperations.flatmap.Book;
import IntermediateOperations.flatmap.Library;
import IntermediateOperations.map.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestMain {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 3, 8, 1, 9);
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        // deafult sorting
        List<Integer> sorted = numbers.stream()
                .sorted()  // ascending order
                .collect(Collectors.toList());

        System.out.println(sorted); // [1, 3, 5, 8, 9]

        // reverse order sorting

        List<String> sortedDesc = names.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        System.out.println(sortedDesc); // [Charlie, Bob, Alice]

        // CustomSorting
        List<Book> books = new ArrayList<>();
        books.add(new Book("Book 1", 100));
        books.add(new Book("Book 2", 50));
        List<Book> sortedByPrice = books.stream()
                .sorted(Comparator.comparing(Book::getPrice)) //Asscending
                .collect(Collectors.toList());

        sortedByPrice.forEach(System.out::println);

        books.sort(new BookComparator());

        // CustomSorting
        List<Book> bookss = new ArrayList<>();
        books.add(new Book("Book 1", 100));
        books.add(new Book("Book 2", 50));
        List<Book> sortedByPrices = bookss.stream()
                .sorted(Comparator.comparing(Book::getPrice).reversed()) //Descending
                .collect(Collectors.toList());

        bookss.forEach(System.out::println);


    }
}
