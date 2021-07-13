
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        // Test your program here!
    }

    public static void printValues(HashMap<String, Book> hashMap) {
        for (Book book : hashMap.values()) {
            System.out.println(book);
        }
    }

    public static void printValueIfNameContains(HashMap<String, Book> hashMap, String text) {
        for (Book book : hashMap.values()) {
            if (book.getName().contains(text)) {
                System.out.println(book);
            }
        }
    }
}
