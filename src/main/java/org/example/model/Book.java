package org.example.model;

public class Book {
    private String bookName;
    private String bookAuthor;
    private BookGenre genre;
    private boolean isAvailable;

    public Book(String bookName, String bookAuthor, BookGenre genre) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.genre = genre;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", genre=" + genre +
                ", isAvailable=" + isAvailable +
                '}';
    }
}
