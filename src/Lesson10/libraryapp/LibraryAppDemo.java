package Lesson10.libraryapp;

import Lesson10.libraryapp.author.*;
import Lesson10.libraryapp.book.*;

import java.util.ArrayList;
import java.util.List;

public class LibraryAppDemo {
    public static void main(String[] args) {
        UserInput userInput = new UserInput();
        //author
        AuthorDtoConverter authorDtoConverter = new AuthorDtoConverter();
        AuthorRepository authorRepository = new AuthorRepository();
        AuthorService authorService = new AuthorService
                (userInput, authorRepository, authorDtoConverter);
        //book
        BookDtoConverter bookDtoConverter = new BookDtoConverter();
        BookRepository bookRepository = new BookRepository();
        BookService bookService = new BookService
                (userInput, bookRepository, bookDtoConverter, authorService);

        List<MenuAction> menuActionList = new ArrayList<>();
        menuActionList.add(new CreateAuthorMenuAction(authorService));
        menuActionList.add(new CreateBookMenuAction(bookService));
        menuActionList.add(new FindAuthorByIdMenuAction(authorService));
        menuActionList.add(new FindBookMenuAction(bookService));
        menuActionList.add(new AddBookInAuthorsListMenuAction(authorService, bookService));
        menuActionList.add(new ExitMenuAction());

        UserMenu userMenu = new UserMenu(menuActionList);
        userMenu.start();
    }
}
