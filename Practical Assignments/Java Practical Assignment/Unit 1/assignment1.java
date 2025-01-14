public class assignment1 {
    // Function without parameters and without return value
    public static void noParamNoReturn() {
        int a = 10, b = 5;
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
    }

    // Function with parameters and without return value
    public static void withParamNoReturn(int a, int b) {
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
    }

    // Function without parameters and with return value
    public static String noParamWithReturn() {
        int a = 10, b = 5;
        return "Addition: " + (a + b) + "\n" +
               "Subtraction: " + (a - b) + "\n" +
               "Multiplication: " + (a * b) + "\n" +
               "Division: " + (a / b);
    }

    // Function with parameters and with return value
    public static String withParamWithReturn(int a, int b) {
        return "Addition: " + (a + b) + "\n" +
               "Subtraction: " + (a - b) + "\n" +
               "Multiplication: " + (a * b) + "\n" +
               "Division: " + (a / b);
    }

    public static void main(String[] args) {
        // Call function without parameters and without return value
        System.out.println("Without Parameters and Without Return:");
        noParamNoReturn();

        // Call function with parameters and without return value
        System.out.println("\nWith Parameters and Without Return:");
        withParamNoReturn(20, 4);

        // Call function without parameters and with return value
        System.out.println("\nWithout Parameters and With Return:");
        System.out.println(noParamWithReturn());

        // Call function with parameters and with return value
        System.out.println("\nWith Parameters and With Return:");
        System.out.println(withParamWithReturn(15, 3));
    }
}
