
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }

    public int getSquares() {
        return squares;
    }

    public int getPrice() {
        return princePerSquare * squares;
    }


    public boolean largerThan(Apartment compared) {
        return squares > compared.getSquares();
    }

    public int priceDifference(Apartment compared) {
        if (getPrice() > compared.getPrice()) {
            return getPrice() - compared.getPrice();
        } else if (getPrice() < compared.getPrice()) {
            return compared.getPrice() - getPrice();
        }
        return 0;
    }

    public boolean moreExpensiveThan(Apartment compared) {
        return getPrice() > compared.getPrice();


    }

}
