import java.util.Scanner;

// Abstract class
abstract class Shape {

    // Abstract method
    abstract double calculateArea();
}

// Concrete class for Circle
class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double calculateArea() {
        return 3.14 * radius * radius;
    }
}

// Concrete class for Rectangle
class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double calculateArea() {
        return length * width;
    }
}

// Main class
public class shape_area {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // User input for Circle
        System.out.print("Enter radius of circle: ");
        double r = sc.nextDouble();

        // Object creation
        Circle c = new Circle(r);

        // Calculate area
        System.out.println("Area of Circle = " + c.calculateArea());

        // User input for Rectangle
        System.out.print("Enter length of rectangle: ");
        double l = sc.nextDouble();

        System.out.print("Enter width of rectangle: ");
        double w = sc.nextDouble();

        // Object creation
        Rectangle rect = new Rectangle(l, w);

        // Calculate area
        System.out.println("Area of Rectangle = " + rect.calculateArea());

        sc.close();
    }
}
