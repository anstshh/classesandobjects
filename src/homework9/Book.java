package homework9;

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

}