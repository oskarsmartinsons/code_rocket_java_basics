package Lesson10.libraryapp.book;

import Lesson10.libraryapp.MenuAction;

import java.util.List;

public class FindBookMenuAction implements MenuAction {
    private BookService bookService;

    public FindBookMenuAction(BookService bookService) {
        this.bookService = bookService;
    }

    @Override
    public String getName() {
        return "Find Book by prefix";
    }

    @Override
    public void execute() {
        System.out.println("Input prefix for search:");
        List<BookDto> bookList = bookService.findAllBooksWithPrefix(bookService.inputPrefix());
        System.out.println("Search Results: " + bookList);
    }
}
