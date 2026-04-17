package workshop5;


abstract class Shape {
    abstract void calculateArea();
    abstract void calculatePerimeter();
}

class Quadrilateral extends Shape {
    @Override
    void calculateArea() {
        System.out.println("Calculating Area of Quadrilateral...");
    }

    @Override
    void calculatePerimeter() {
        System.out.println("Calculating Perimeter of Quadrilateral...");
    }
}

public class qs5 {
    public static void main(String[] args) {
        Quadrilateral q = new Quadrilateral();
        q.calculateArea();
        q.calculatePerimeter();
    }
}

