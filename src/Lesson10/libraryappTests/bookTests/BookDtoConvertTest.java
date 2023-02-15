package Lesson10.libraryappTests.bookTests;

import Lesson10.libraryapp.book.Book;
import Lesson10.libraryapp.book.BookDto;
import Lesson10.libraryapp.book.BookDtoConverter;

public class BookDtoConvertTest {
    public void testConvert(Book book) {
        BookDtoConverter bookDtoConverter = new BookDtoConverter();
        BookDto actualBookDto = bookDtoConverter.convert(book);

        BookDto expectedBookDto = new BookDto();
        expectedBookDto.setTitle(book.getTitle());

        if (expectedBookDto.equals(actualBookDto)) {
            System.out.println("BookDtoConverter: testConvert - PASSED " +
                    "(expected = " + expectedBookDto + ", actual = " + actualBookDto +")");

        } else {
            System.err.println("BookDtoConverter: testConvert - FAILED " +
                    "(expected = " + expectedBookDto + ", actual = " + actualBookDto +")");
        }
    }
}
