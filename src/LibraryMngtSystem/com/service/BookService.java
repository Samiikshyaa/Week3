package LibraryMngtSystem.com.service;

import LibraryMngtSystem.com.model.Books;

import java.util.List;

public interface BookService {
    void addBooks(Books b);
    List<Books> checkOutBooks(Books b);
    List<Books> returnBooks(Books b);
    void searchBooksbyTitle(String title);
    void searchBooksbyAuthor(String author);
}
