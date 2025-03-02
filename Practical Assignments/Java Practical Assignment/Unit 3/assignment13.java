class Rectangle {
    int length, breadth;

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    void printArea() {
        System.out.println("Area of Rectangle = " + (length * breadth));
    }

    void printPerimeter() {
        System.out.println("Perimeter of Rectangle = " + (2 * (length + breadth)));
    }
}

class Square extends Rectangle {
    Square(int side) {
        super(side, side);
    }
}

public class assignment13 {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(10, 5);
        rect.printArea();
        rect.printPerimeter();

        Square square = new Square(4);
        square.printArea();
        square.printPerimeter();
    }
}
