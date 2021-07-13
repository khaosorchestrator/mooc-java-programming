
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class LiteracyComparison {

    public static void main(String[] args) {
        print("literacy.csv");
    }

    public static void print(String file) {
        try {
            Files.lines(Paths.get(file))
                    .map(s -> s.split(","))
                    .sorted((a, b) -> a[5].compareTo(b[5]))
                    .forEach(str -> System.out.println(str[3] + " (" + str[4] + "), " + str[2].split(" ")[1] + ", " + str[5]));
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
