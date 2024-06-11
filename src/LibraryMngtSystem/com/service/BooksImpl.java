package LibraryMngtSystem.com.service;

import LibraryMngtSystem.com.model.Books;

import java.util.ArrayList;
import java.util.List;

public class BooksImpl implements BookService{
    static List<Books> blist = new ArrayList<>();
    static  List<Books>availableBooks = new ArrayList<>();
    static  List<Books>checkOutBooks = new ArrayList<>();

    @Override
    public void addBooks(Books b) {
      blist.add(b);
      System.out.println("Book Added");
    }

    @Override
    public List<Books> checkOutBooks(Books b) {
        if(blist.contains(b) && availableBooks.contains(b)){
            checkOutBooks.add(b);
        }else{
            System.out.println("The book you are refering is not available. ");
        }
        return checkOutBooks;
    }

    @Override
    public List<Books> returnBooks(Books b) {
        if(checkOutBooks.contains(b) && blist.contains(b)){
            availableBooks.add(b);
        }
        return availableBooks;
    }

    @Override
    public void searchBooksbyTitle(String title) {
        Books b = new Books();
        if (b.getBookname().equalsIgnoreCase(title)){
            System.out.println(b);
        }else {
            System.out.println("Our library doesn\'t have this book. ");
        }
    }

    @Override
    public void searchBooksbyAuthor(String author) {
        Books b = new Books();
        if (b.getAuthor().equalsIgnoreCase(author)){
            System.out.println(b);
        }else {
            System.out.println("Our library doesn\'t have this book. ");
        }
    }
}
