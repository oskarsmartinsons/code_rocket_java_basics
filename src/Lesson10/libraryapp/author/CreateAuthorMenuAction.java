package Lesson10.libraryapp.author;

import Lesson10.libraryapp.MenuAction;

import java.util.Scanner;

public class CreateAuthorMenuAction implements MenuAction {
    private AuthorService authorService;

    public CreateAuthorMenuAction(AuthorService authorService) {
        this.authorService = authorService;
    }

    @Override
    public String getName() {
        return "Create Author";
    }

    @Override
    public void execute() {
        AuthorDto authorDto = authorService.save(authorService.create());
        System.out.println("Saved author: " + authorDto);
    }
}