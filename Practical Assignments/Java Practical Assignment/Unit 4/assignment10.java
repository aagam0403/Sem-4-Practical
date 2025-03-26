import java.util.Scanner;
import java.util.Arrays;

class assignment10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of integers: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Sorted integers in descending order:");
        try {
            for (int i = n - 1; i >= 0; i--) {
                System.out.println(arr[i]);
            }
            System.out.println(arr[n]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds");
        }
    }
}
