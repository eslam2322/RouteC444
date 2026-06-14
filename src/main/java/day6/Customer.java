package day6;

public class Customer {

    public static void main(String[] args) {

        Book book = new Book();

        book.bookSearch(
                10.99,
                "Java Programming",
                "John Doe",
                12345,
                1998
        );

        book.bookSearch(
                5.0,
                "Python Programming",
                "Jane Doe",
                54321,
                1997
        );

        book.bookFiltration(500);
    }
}