package homework9;

public class Homework9 {

    public static void main(String[] args) {
        System.out.println();
        System.out.println("First book");

        //First Book.

        Author author = new Author("Stephenie", "Mayer");
        Book book = new Book("Twilight", 2005, author);
        String authorFirstName = author.getFirstName();
        String authorSecondName = author.getSecondName();
        String bookTitle = book.getBookTitle();
        book.setPublishingYear(2005);


        //System.out.println("Book title - " + bookTitle);
        //System.out.println("Publishing year - " + book.getPublishingYear());
        //System.out.println("Author - " + authorFirstName + authorSecondName);
        System.out.println(book.getBookTitle() + " " + book.getAuthor().getFirstName() + " " + book.getAuthor().getSecondName() + " " + book.getPublishingYear());
        System.out.println(book);

        System.out.println();
        System.out.println("Second book");

        //Second Book.

        Author authorBook2 = new Author("Brit", "Bennet");
        Book book2 = new Book("The Vanishing Half", 2020, author);


        System.out.println("Book title - " + book2.getBookTitle());
        System.out.println("Publishing year - " + book2.getPublishingYear());
        System.out.println("Author - " + authorBook2.getFirstName() + authorBook2.getSecondName());

       //Year change.

        book2.setPublishingYear(2001);
        System.out.println("New publishing year - " + book2.getPublishingYear());

        System.out.println(book.hashCode() == book2.hashCode());
        System.out.println(book.equals(book2));
    }
}