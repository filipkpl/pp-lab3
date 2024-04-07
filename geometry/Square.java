package geometry;
public class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }

    public double getSide() {
        return getWidth(); 
    }

    @Override
    public String toString() {
        return "Kwadrat[side=" + getSide() + "]";
    }
}