
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Archive> archive = new ArrayList<>();

        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String id = scanner.nextLine();

            if (id.isEmpty()) {
                break;
            }

            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();

            if (name.isEmpty()) {
                break;
            }

            Archive newArchive = new Archive(id, name);

            if (!archive.contains(newArchive)) {
                archive.add(newArchive);
            }
        }

        System.out.println("==Items==");
        for (Archive arch : archive) {
            System.out.println(arch);
        }

    }
}
