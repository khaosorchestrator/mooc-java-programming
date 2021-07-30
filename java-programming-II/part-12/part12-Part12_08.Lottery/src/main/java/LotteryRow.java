
import java.util.ArrayList;
import java.util.Random;

public final class LotteryRow {

    private ArrayList<Integer> numbers;

    public LotteryRow() {
        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void randomizeNumbers() {
        this.numbers = new ArrayList<>();

        while (this.numbers.size() < 7) {
            int value = new Random().nextInt(40) + 1;

            if (!this.containsNumber(value)) {
                this.numbers.add(value);
            }
        }
    }

    public boolean containsNumber(int number) {
        return this.numbers.contains(number);
    }
}
