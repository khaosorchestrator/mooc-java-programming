
public class Program {

    public static void main(String[] args) {
        // test your method here
    }

    public static int sum(int[] array, int fromWhere, int toWhere, int smallest, int largest) {
        if (fromWhere < 0) {
            fromWhere = 0;
        }

        if (toWhere > array.length) {
            toWhere = array.length;
        }

        int sum = 0;
        
        if (fromWhere >= 0 && toWhere <= array.length) {
            for (int i = fromWhere; i < toWhere; i++) {
                if (array[i] > smallest && array[i] < largest) {
                    sum += array[i];
                }
            }
        }

        return sum;
    }
}
