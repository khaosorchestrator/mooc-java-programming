
public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {
        MagicSquare square = new MagicSquare(size);
        final int SIZE = size * size;

        int number = 1;
        int column = size / 2;
        int row = 0;

        boolean isValidRow;
        boolean isValidColumn;

        while (number <= SIZE) {
            isValidRow = square.readValue(row - 1) != -1;
            isValidColumn = square.readValue(column + 1) != -1;
            square.placeValue(column, row, number++);
            
            if (!isValidRow && isValidColumn) {
                if (square.readValue(size - 1, ++column) == 0) row = size - 1;
            } else if (isValidRow && !isValidColumn) {
                if (square.readValue(--row, 0) == 0) column = 0;
            } else if (isValidRow && isValidColumn) {
                if (square.readValue(row - 1, column + 1) != 0) ++row;
                else {
                    ++column;
                    --row;
                }
            } else ++row;
            
        }
        return square;
    }
}
