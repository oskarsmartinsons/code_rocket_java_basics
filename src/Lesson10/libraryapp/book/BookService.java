package Lesson10.libraryapp.book;

import java.util.List;
import java.util.stream.Collectors;

public class BookService {
    private final BookRepository bookRepository;
    private final BookDtoConverter bookDtoConverter;

    public BookService(BookRepository bookRepository, BookDtoConverter bookDtoConverter) {
        this.bookRepository = bookRepository;
        this.bookDtoConverter = bookDtoConverter;
    }

    public BookDto save (Book book) {
        Book savedBook = bookRepository.save(book);
        return bookDtoConverter.convert(savedBook);
    }

    public List<BookDto> findAllBooksWithPrefix(String prefix){
        return bookRepository.findAllByStartWith(prefix).stream()
                .map(bookDtoConverter::convert)
                .collect(Collectors.toList());
    }
}
