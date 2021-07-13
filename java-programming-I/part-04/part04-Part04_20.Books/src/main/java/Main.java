
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while (true) {
            System.out.print("Title: ");
            String title = input.nextLine();

            if (title.isEmpty()) {
                break;
            }
            
            System.out.print("Pages: ");
            int pages = Integer.valueOf(input.nextLine());

            System.out.print("Publication year: ");
            int publicationYear = Integer.valueOf(input.nextLine());
            
            books.add(new Book(title, pages, publicationYear));
        }
        
        System.out.println("");
        
        System.out.print("What information will be printed? ");
        String choice = input.nextLine();
        
        for (Book book: books) {
            if (choice.equals("everything")) {
                System.out.println(book);
            }
            else {
                System.out.println(book.getTitle());
            }
        }
    }
}
