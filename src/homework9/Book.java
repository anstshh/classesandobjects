package homework9;

import java.util.Objects;

public class Book {
    private String bookTitle;
    private int publishingYear;
    private Author author;

    public Book(String bookTitle, int publishingYear, Author author) {
        this.bookTitle = bookTitle;
        this.publishingYear = publishingYear;
        this.author = author;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    public homework9.Author getAuthor() {
        return author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publishingYear == book.publishingYear && bookTitle.equals(book.bookTitle) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookTitle, publishingYear, author);
    }

    @Override
    public String toString() {
        return bookTitle + " " + author + " " + publishingYear;
    }
}

