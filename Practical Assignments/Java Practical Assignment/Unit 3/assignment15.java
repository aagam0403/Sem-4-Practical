import shapes.Circle;
import java.util.Scanner;

public class assignment15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get radius from user
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        // Create Circle object and calculate area
        Circle circle = new Circle(radius);
        System.out.println("Area of the Circle: " + circle.calculateArea());

        scanner.close();
    }
}
