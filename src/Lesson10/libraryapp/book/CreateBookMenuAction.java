package Lesson10.libraryapp.book;

import Lesson10.libraryapp.MenuAction;

public class CreateBookMenuAction implements MenuAction {
    private BookService bookService;

    public CreateBookMenuAction(BookService bookService) {
        this.bookService = bookService;
    }

    @Override
    public String getName() {
        return "Create Book";
    }

    @Override
    public void execute() {
        Book book = bookService.create();
        BookDto bookDto = bookService.save(book);
        System.out.println("Saved book: " + bookDto);
    }
}
