
interface Shape {
    double area();
    double circumference();
}

// Implement the Shape interface in the Circle class
class Circle implements Shape {
    private double radius;

    // Constructor to initialize the radius of the circle
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double circumference() {
        return 2 * Math.PI * radius;
    }
}

// Implement the Shape interface in the Square class
class Square implements Shape {
    private double side;

    // Constructor to initialize the side of the square
    public Square(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public double circumference() {
        return 4 * side;
    }
}

// Main class to test the implementation
public class InterfaceCalledShape{
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape square = new Square(4);

        System.out.println("Circle area: " + circle.area());
        System.out.println("Circle circumference: " + circle.circumference());

        System.out.println("Square area: " + square.area());
        System.out.println("Square circumference: " + square.circumference());
    }
}
