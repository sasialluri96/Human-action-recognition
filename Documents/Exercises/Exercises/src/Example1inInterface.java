interface Shape {
    void area();
    void circumference();
}
class Circle implements Shape {
    int r = 6;
    public void area() {
        System.out.println("Area of a circle:"+ Math.PI*r*r);
    }
    public void circumference() {
        System.out.println("Area of a circumference:"+ 2*Math.PI*r); 
    }
}
class Square implements Shape {
    int side = 4;
    public void area(){
        System.out.println("Area of a Square:" + side*side);
    }
    public void circumference() {
        System.out.println("Area of a circumference:"+ 4*side); 
    }
}
public class Example1inInterface {
    public static void main(String[] args) {
        Circle c = new Circle();
        Square s = new Square();
        c.area();
        c.circumference();
        s.area();
        s.circumference();
    }

}
