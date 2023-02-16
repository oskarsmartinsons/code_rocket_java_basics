package Lesson10.libraryapp.book;

import Lesson10.libraryapp.author.Author;

import java.util.Objects;

public class BookDto {
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookDto bookDto = (BookDto) o;
        return Objects.equals(title, bookDto.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title);
    }

    @Override
    public String toString() {
        return "BookDto{" +
                "title='" + title + '\'' +
                '}';
    }
}
