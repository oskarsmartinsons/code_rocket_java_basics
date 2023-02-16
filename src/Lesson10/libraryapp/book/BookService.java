package Lesson10.libraryapp.book;

import Lesson10.libraryapp.UserInput;
import Lesson10.libraryapp.author.Author;
import Lesson10.libraryapp.author.AuthorDto;
import Lesson10.libraryapp.author.AuthorService;

import java.util.List;
import java.util.stream.Collectors;

public class BookService {
    private final UserInput userInput;
    private final BookRepository bookRepository;
    private final BookDtoConverter bookDtoConverter;
    private final AuthorService authorService;

    public BookService(UserInput userInput, BookRepository bookRepository, BookDtoConverter bookDtoConverter, AuthorService authorService) {
        this.userInput = userInput;
        this.bookRepository = bookRepository;
        this.bookDtoConverter = bookDtoConverter;
        this.authorService = authorService;
    }

    public Book create(){
        return userInput.inputBook();

    }

    public BookDto save (Book book) {
        Book savedBook = bookRepository.save(book);
        return bookDtoConverter.convert(savedBook);
    }

    public String inputPrefix(){
        return userInput.inputText();
    }

    public List<BookDto> findAllBooksWithPrefix(String prefix){
        return bookRepository.findAllByStartWith(prefix).stream()
                .map(bookDtoConverter::convert)
                .collect(Collectors.toList());
    }


}
