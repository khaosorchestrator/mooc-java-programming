
import java.util.Arrays;

public class MainProgram {

    public static int smallest(int[] array) {
        int small = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < small) {
                small = array[i];
            }
        }

        return small;
    }

    public static int indexOfSmallest(int[] array) {
        int small = smallest(array);

        for (int i = 0; i < array.length; i++) {
            if (array[i] == small) {
                return i;
            }
        }

        return -1;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int index = startIndex;
        int value = table[startIndex];

        for (int i = startIndex; i < table.length; i++) {
            if (value > table[i]) {
                index = i;
                value = table[i];
            }
        }

        return index;
    }

    public static void swap(int[] array, int index1, int index2) {
        int aux = array[index1];
        array[index1] = array[index2];
        array[index2] = aux;
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            swap(array, i, indexOfSmallestFrom(array, i));
            System.out.println(Arrays.toString(array));
        }
    }

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 2, 12};
        sort(array);
    }

}
