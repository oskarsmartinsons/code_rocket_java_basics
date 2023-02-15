package Lesson10.libraryappTests.authorTests;

import Lesson10.libraryapp.author.Author;
import Lesson10.libraryapp.author.AuthorDto;
import Lesson10.libraryapp.author.AuthorDtoConverter;

public class AuthorDtoConverterTest {
    public void testConvert(Author author) {
        AuthorDtoConverter authorDto = new AuthorDtoConverter();
        AuthorDto actualAuthorDto = authorDto.convert(author);

        AuthorDto expectedAuthorDto = new AuthorDto();
        expectedAuthorDto.setName(author.getName());
        expectedAuthorDto.setLastname(author.getLastname());

        if (expectedAuthorDto.equals(actualAuthorDto)) {
            System.out.println("AuthorDtoConverter: testConvert - PASSED " +
                    "(expected = " + expectedAuthorDto + ", actual = " + actualAuthorDto +")");

        } else {
            System.err.println("AuthorDtoConverter: testConvert - FAILED " +
                    "(expected = " + expectedAuthorDto + ", actual = " + actualAuthorDto +")");
        }
    }
}
