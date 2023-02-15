package Lesson10.libraryapp.author;

import Lesson10.libraryapp.MenuAction;

public class FindAuthorByIdMenuAction implements MenuAction {
    private AuthorService authorService;

    public FindAuthorByIdMenuAction(AuthorService authorService) {
        this.authorService = authorService;
    }

    @Override
    public String getName() {
        return "Find Author by Id";
    }

    @Override
    public void execute() {
        AuthorDto authorDto = authorService.getAuthorById(authorService.inputAuthorId());
        System.out.println("Search result: " + authorDto);
    }
}
