package geometry;
public class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }

    // Dodatkowa metoda nie jest potrzebna, ponieważ getWidth() lub getLength() z Rectangle mogą być użyte
    // Jeśli jednak chcesz jawnie dodać metodę dla czytelności:
    public double getSide() {
        return getWidth(); // Możesz użyć getWidth() lub getLength(), ponieważ w kwadracie są one równe
    }

    @Override
    public String toString() {
        return "Kwadrat[side=" + getSide() + "]";
    }
}