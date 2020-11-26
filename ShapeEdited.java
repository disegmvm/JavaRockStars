public interface ShapeEdited {

    double calculateArea();
    double calculatePerimeter();
}
class Circle2 implements ShapeEdited {
    double radius;
    Circle2(double radius){
        this.radius=radius;
    }
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    @Override
    public double calculatePerimeter() {
        return 2*Math.PI*radius;
    }
}
class Square2 implements ShapeEdited {
double length, width;
Square2(double length, double width){
    this.length=length;
    this.width=width;
}
    @Override
    public double calculateArea() {
        return length*width;
    }

    @Override
    public double calculatePerimeter() {
        return length*2+width*2;
    }
}
class ShapeTester{
    public static void main(String[] args) {
        Circle2 circle = new Circle2(10.9);
        System.out.println("Area of circle is "+circle.calculateArea());
        System.out.println("Perimeter of circle is "+circle.calculatePerimeter());
        Square2 square = new Square2(20.2,30.39);
        System.out.println("Area of square is "+square.calculateArea());
        System.out.println("Perimeter of square is "+square.calculatePerimeter());
    }
}
