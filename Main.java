import geometry.Point;
import geometry.Circle;

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
    }
}