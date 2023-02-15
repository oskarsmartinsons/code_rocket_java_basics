package Lesson10.libraryapp.author;

import java.util.Objects;

public class AuthorDto {

    private String name;
    private String lastname;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AuthorDto authorDto = (AuthorDto) o;
        return Objects.equals(name, authorDto.name) && Objects.equals(lastname, authorDto.lastname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastname);
    }

    @Override
    public String toString() {
        return "AuthorDto{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }
}