
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        if (this.squares > compared.getSquares()) {
            return true;
        }

        if (this.squares < compared.getSquares()) {
            return false;
        }

        if (this.rooms > compared.getRooms()) {
            return true;
        }

        return false;
    }

    public int priceDifference(Apartment compared) {
        if (this.largerThan(compared)) {
            return this.princePerSquare * this.squares - compared.getPrincePerSquare() * compared.getSquares();
        }
        return compared.getPrincePerSquare() * compared.getSquares() - this.princePerSquare * this.squares;
    }

    public boolean moreExpensiveThan(Apartment compared) {
        if (this.princePerSquare > compared.getPrincePerSquare()) {
            return true;
        }
        return false;
    }

    public int getRooms() {
        return rooms;
    }

    public int getSquares() {
        return squares;
    }

    public int getPrincePerSquare() {
        return princePerSquare;
    }

}
