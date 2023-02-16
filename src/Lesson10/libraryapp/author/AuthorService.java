package Lesson10.libraryapp.author;
import Lesson10.libraryapp.*;
import Lesson10.libraryapp.book.Book;

import java.util.List;

public class AuthorService {
    private final UserInput userInput;
    private final AuthorRepository authorRepository;
    private final AuthorDtoConverter authorDtoConverter;

    public AuthorService(UserInput userInput, AuthorRepository authorRepository, AuthorDtoConverter authorDtoConverter) {
        this.userInput = userInput;
        this.authorRepository = authorRepository;
        this.authorDtoConverter = authorDtoConverter;
    }

    public Author create() {
        return userInput.inputAuthor();
    }

    public Integer inputAuthorId(){
        return userInput.inputId();
    }

    public AuthorDto save(Author author) {
        Author savedAuthor = authorRepository.save(author);
        return authorDtoConverter.convert(savedAuthor);
    }

    public AuthorDto getAuthorById(Integer id) {
//        Author author = authorRepository.findAuthorById(id);
//        if (author == null) {
//            throw new EntityNotFoundException();
//        }
//        AuthorDto dto = authorDtoConverter.convert(author);
//        return dto;
//
        return authorRepository.findAuthorById(id)
                .map(authorDtoConverter::convert)
                .orElseThrow(() -> new EntityNotFoundException("Author not found with id = " + id));
    }

    public String getAuthorNameById(Integer id) {
        return authorRepository.findAuthorById(id)
                .map(Author::getName)
                .orElseThrow(() -> new EntityNotFoundException("Author not found with id = " + id));
    }

    public Author addBookInTheList(Author author, Book book) {
        List<Book> bookList=author.getBooks();
        bookList.add(book);
        return author;
    }

    public Author searchAuthorById(Integer id) {
        return authorRepository.findAuthorById(id)
                .orElseThrow(() -> new EntityNotFoundException("Author not found with id = " + id));
    }
}