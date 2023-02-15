package Lesson10.libraryapp;
import Lesson10.libraryapp.author.Author;
import Lesson10.libraryapp.book.Book;
import java.util.Scanner;

public class UserInput {
    public Author inputAuthor () {
        Author newAuthor = new Author();
        System.out.println("Author name: ");
        newAuthor.setName(inputText());
        System.out.println("Author last name: ");
        newAuthor.setLastname(inputText());
        return newAuthor;
    }

    public Book inputBook () {
        Book newBook = new Book();
        System.out.println("Book name: ");
        newBook.setTitle(inputText());
        return newBook;
    }

    public Integer inputId () {
        System.out.println("Input Id: ");
        return inputInteger();
    }

    public String inputText() {
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    public Integer inputInteger() {
        Scanner input = new Scanner(System.in);
        return  input.nextInt();
    }
}
