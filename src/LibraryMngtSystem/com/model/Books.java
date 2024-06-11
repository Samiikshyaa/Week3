package LibraryMngtSystem.com.model;

public class Books {
    private String bookname;
    private String author;

    public Books(){
        this.bookname = bookname;
        this.author = author;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Books{" +
                "bookname='" + bookname + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
