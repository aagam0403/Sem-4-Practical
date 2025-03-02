class Shape {
    void printShape() {
        System.out.println("This is shape");
    }
}

class Rectangle extends Shape {
    void printRectangle() {
        System.out.println("This is rectangular shape");
    }
}

class Circle extends Rectangle {
    void printCircle() {
        System.out.println("This is circular shape");
    }
}

class Square extends Circle {
    void printSquare() {
        System.out.println("Square is a rectangle");
    }
}

public class assignment14 {
    public static void main(String[] args) {
        Square square = new Square();
        square.printShape();
        square.printRectangle();
    }
}
