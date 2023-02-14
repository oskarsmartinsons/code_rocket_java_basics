package Lesson10.libraryapp.book;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BookRepository {
    private static Integer bookIdSequence = 0;

    private Map<Integer, Book> repository = new HashMap<>();


    public Book save (Book book) {
        book.setId(bookIdSequence);
        repository.put(book.getId(),book);
        bookIdSequence++;
        return book;
    }


    public List<Book> findAllByStartWith(String prefix) {
        return repository.values().stream()
                .filter(book -> book.getTitle().startsWith(prefix))
                .collect(Collectors.toList());
    }
}