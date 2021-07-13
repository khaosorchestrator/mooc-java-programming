
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        input += " " + scanner.nextLine();

        if (!input.isEmpty()) {
            for (String string : input.split(" ")) {
                if (string.equals("")) {
                    continue;
                }
                System.out.println(string);
            }
        }
    }
}
