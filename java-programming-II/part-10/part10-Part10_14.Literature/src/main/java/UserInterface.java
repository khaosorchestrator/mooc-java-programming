
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author lucas
 */
public class UserInterface {

    private Scanner scanner;
    private ArrayList<Book> books;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.books = new ArrayList<>();
    }

    public void start() {
        while (true) {
            System.out.print("Input the name of the book, empty stops: ");
            String name = this.scanner.nextLine();

            if (name.isEmpty()) {
                break;
            }

            System.out.print("Input the age recommendation: ");
            int recommendation = Integer.valueOf(this.scanner.nextLine());

            this.books.add(new Book(name, recommendation));
            System.out.println("");
        }
        System.out.println("");
        System.out.println(this.books.size() + " books in total.");
        System.out.println("");
        printBooks();
    }

    public void printBooks() {
        System.out.println("Books:");
        Comparator<Book> comparator = Comparator
                .comparing(Book::getRecommendation)
                .thenComparing(Book::getName);

        Collections.sort(this.books, comparator);

        this.books.stream().forEach(System.out::println);
    }
}
