import java.util.Scanner;

class assignment11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        try {
            int num = Integer.parseInt(input);
            System.out.println("Converted integer: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a numeric value.");
        }
    }
}
