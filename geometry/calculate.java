package geometry;

public class calculate {
    public static void main(String[] args) {

        Circle[] circles = new Circle[] {
            new Circle(new Point(0, 0), 5),
            new ColoredCircle(new Point(1, 1), 7, "niebieski"),
            new Circle(new Point(2, 2), 3),
            new ColoredCircle(new Point(3, 3), 4, "zielony")
        };

        for (Circle circle : circles) {
            System.out.println("Pole powierzchni koła: " + circle.calculateArea());
            
 
            if (circle instanceof ColoredCircle) {
                ColoredCircle coloredCircle = (ColoredCircle) circle;
                System.out.println("Kolor koła: " + coloredCircle.getColor());
            }
        }
    }
}