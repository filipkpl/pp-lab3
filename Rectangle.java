public class Rectangle {
    private double length;
    private double width;

    // Konstruktor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Metoda obliczająca pole powierzchni prostokąta
    public double calculateArea() {
        return length * width;
    }

    // Metoda obliczająca obwód prostokąta
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
    
    @Override
    public String toString() {
        return "Prostokąt[length=" + length + ", width=" + width + "]";
    }
}
