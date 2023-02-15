package Lesson10.libraryappTests;

import Lesson10.libraryapp.author.Author;
import Lesson10.libraryapp.book.Book;
import Lesson10.libraryappTests.authorTests.AuthorDtoConverterTest;
import Lesson10.libraryappTests.bookTests.BookDtoConvertTest;

import java.util.ArrayList;
import java.util.List;

public class LibraryAppTests {
    public static void main(String[] args) {

        // Test Data - books
        Book testBook1 = new Book();
        testBook1.setId(0);
        testBook1.setTitle("Davinci Code");
        Book testBook2 = new Book();
        testBook1.setId(1);
        testBook1.setTitle("Inferno");
        // Test Data - book list
        List<Book> testBookListDenBraun = new ArrayList<>();
        testBookListDenBraun.add(testBook1);
        testBookListDenBraun.add(testBook2);
        // Test Data - author
        Author testAuthorDenBraun = new Author();
        testAuthorDenBraun.setId(0);
        testAuthorDenBraun.setName("Den");
        testAuthorDenBraun.setLastname("Braun");
        testAuthorDenBraun.setBooks(testBookListDenBraun);

        // Tests
        AuthorDtoConverterTest authorDtoConverterTest = new AuthorDtoConverterTest();
        authorDtoConverterTest.testConvert(testAuthorDenBraun);

        BookDtoConvertTest bookDtoConvertTest = new BookDtoConvertTest();
        bookDtoConvertTest.testConvert(testBook1);
    }
}
