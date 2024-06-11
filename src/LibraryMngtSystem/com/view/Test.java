package LibraryMngtSystem.com.view;

import LibraryMngtSystem.com.model.Books;
import LibraryMngtSystem.com.service.BooksImpl;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        BooksImpl bi = new BooksImpl();
        Books book = new Books();
        Scanner sc = new Scanner(System.in);
        char ch = 'y';
        do {
            System.out.println("Enter the book title: ");
            book.setBookname(sc.next());
            System.out.println("Enter the author name: ");
            book.setAuthor(sc.next());

            bi.addBooks(book);

            System.out.println("Do you want to add more? [y/n]");
            ch = sc.next().charAt(0);
        }while(String.valueOf(ch).equalsIgnoreCase("y"));

//        bi.checkOutBooks(book);
//        bi.returnBooks(book);
//        bi.searchBooksbyTitle("CLanguage");
//        bi.searchBooksbyAuthor("Ramu");

    }
}
