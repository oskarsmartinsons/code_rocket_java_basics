package Lesson10.libraryapp.author;

public class AuthorDtoConverter {

    public AuthorDto convert(Author author) {
        AuthorDto dto = new AuthorDto();
        dto.setName(author.getName());
        dto.setLastname(author.getLastname());
        return dto;
    }
}