package IntermediateOperations.flatmap;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Book {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}

class Library {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> getBooks() {
        return books;
    }
}

public class StreamFlatMapExample {
    public static void main(String[] args) {
        // Create two libraries with books
        Library library1 = new Library();
        library1.addBook(new Book("Book 1"));
        library1.addBook(new Book("Book 2"));

        Library library2 = new Library();
        library2.addBook(new Book("Book 3"));
        library2.addBook(new Book("Book 4"));

        List<Library> listOfLibraries = new ArrayList<>();

        listOfLibraries.add(library1);
        listOfLibraries.add(library2);

        // Combine books from multiple libraries into a single list using flatMap
       // List<Book> allBooks = List.of(library1, library2)
        List<Book> allBooks=listOfLibraries
                .stream()
                .flatMap(library -> library.getBooks().stream())
                .collect(Collectors.toList());

        // Print the list of all books
        allBooks.forEach(book -> System.out.println(book.getTitle()));
    }
}
