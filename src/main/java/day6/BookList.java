package day6;

public class BookList {

    double hamdaBookPrice = 1000;
    double z3bolaBookPrice = 500;
    double al3azBookPrice = 1500;
    double voisBookPrice = 2000;
    double z3bola = 0.3;
    public String bookFiltration(double price) {
        if (price >= 1000) {
            System.out.println(
                    "Available books for this price are: Hamda, Al3az and Vois");
        } else if (price >= 500) {
            System.out.println(
                    "Available books for this price are: Hamda and Z3bola");
        } else if (price >= 0) {
            System.out.println(
                    "Available book for this price is: Z3bola");
        } else {
            System.out.println(
                    "We don't have any books for this price!");
        }
        return "";
    }
}