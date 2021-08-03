
public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {
        MagicSquare square = new MagicSquare(size);
        final int SIZE = size * size;

        int number = 1;
        int column = size / 2;
        int row = 0;

        boolean isValidRow;
        boolean isValidColumn;

        square.placeValue(column, row, number++);
        while (number <= SIZE) {
            isValidRow = square.readValue(row - 1) != -1;
            isValidColumn = square.readValue(column + 1) != -1;

            if (!isValidRow && isValidColumn) {
                if (square.readValue(size - 1, ++column) == 0) {
                    row = size - 1;
                    square.placeValue(column, row, number++);
                }
            } else if (isValidRow && !isValidColumn) {
                if (square.readValue(--row, 0) == 0) {
                    square.placeValue(0, row, number++);
                    column = 0;
                }
            } else if (isValidRow && isValidColumn) {
                if (square.readValue(row - 1, column + 1) != 0) {
                    square.placeValue(column, ++row, number++);
                } else {
                    square.placeValue(++column, --row, number++);
                }
            } else {
                square.placeValue(column, ++row, number++);
            }
        }
        return square;
    }
}
