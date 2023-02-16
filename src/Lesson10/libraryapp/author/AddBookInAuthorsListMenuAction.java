package Lesson10.libraryapp.author;

import Lesson10.libraryapp.MenuAction;
import Lesson10.libraryapp.book.Book;
import Lesson10.libraryapp.book.BookService;

import java.sql.SQLOutput;

public class AddBookInAuthorsListMenuAction implements MenuAction {
    private AuthorService authorService;
    private BookService bookService;

    public AddBookInAuthorsListMenuAction(AuthorService authorService, BookService bookService) {
        this.authorService = authorService;
        this.bookService = bookService;
    }

    @Override
    public String getName() {
        return "Add Book to Authors Book List";
    }

    @Override
    public void execute() {
        System.out.println("Search For Author");
        Integer id = authorService.inputAuthorId();
        Author author = authorService.searchAuthorById(id);
        System.out.println("Author found: " + author);
        Book book = bookService.create();
        book.setAuthorId(id);
        bookService.save(book);
        authorService.addBookInTheList(author, book);
        System.out.println("Book Saved in the list: " + author);
    }
}
