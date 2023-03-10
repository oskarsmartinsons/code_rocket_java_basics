package Lesson10.libraryapp.author;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class AuthorRepository {

    private static Integer authorIdSequence = 0;
    private Map<Integer, Author> repository = new HashMap<>();

    public Author save(Author author) {
        author.setId(authorIdSequence);
        authorIdSequence++;
        repository.put(author.getId(), author);

        return author;
    }

    public Optional<Author> findAuthorById(Integer id) {
        return Optional.ofNullable(repository.get(id));
    }

}