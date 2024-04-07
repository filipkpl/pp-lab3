import geometry.Point;
import geometry.Circle;
import geometry.ColoredCircle;
import geometry.Rectangle;

public class Main {
    public static void main(String[] args) {
        // Point
        Point center = new Point(0, 0);
        System.out.println("zad1");
        System.out.println("Właściwości punktu: " + center);

        // Circle
        Circle circle = new Circle(center, 10);
        System.out.println("zad2");
        System.out.println("Właściwości koła: " + circle);
        System.out.println("Obwód koła: " + circle.calculatePerimeter());
        System.out.println("Pole powierzchni koła: " + circle.calculateArea());

        // ColoredCircle
        ColoredCircle coloredCircle = new ColoredCircle(center, 10, "czerwony");
        System.out.println("zad3");
        System.out.println("Właściwości kolorowego koła: " + coloredCircle);
        System.out.println("Obwód kolorowego koła: " + coloredCircle.calculatePerimeter());
        System.out.println("Pole powierzchni kolorowego koła: " + coloredCircle.calculateArea());
        System.out.println("Kolor koła: " + coloredCircle.getColor());
        
        // Rectangle
        Rectangle rectangle = new Rectangle(5.0, 10.0);
        System.out.println("zad5");
        System.out.println("Pole powierzchni prostokąta: " + rectangle.calculateArea());
        System.out.println("Obwód prostokąta: " + rectangle.calculatePerimeter());

    }
}
