
public class Program {

    public static void main(String[] args) {
        // main program
        Die die = new Die(6);

        int i = -1;
        
        while (i++ < 10) {
            System.out.println(die.throwDie());
        }

    }
}
