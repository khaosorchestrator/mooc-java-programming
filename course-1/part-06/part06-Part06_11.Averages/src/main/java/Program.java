
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        //82 83 96 51 48 56 61
        Scanner scanner = new Scanner(System.in);

        GradeRegister register = new GradeRegister();
        UserInterface ui = new UserInterface(register, scanner);
        ui.start();
    }
}
