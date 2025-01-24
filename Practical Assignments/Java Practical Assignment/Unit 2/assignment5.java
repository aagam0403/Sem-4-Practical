import java.util.*;
public class assignment5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter row : ");
        int rows = sc.nextInt();
        System.out.println(" enter column : ");
        int cols = sc.nextInt();
        int arr[][] = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println(" enter elements : ");
                arr[i][j]=(sc.nextInt());
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("\t" +arr[i][j]);
            }
            System.out.println();
        }
        int min=arr[0][0];
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                if(min>arr[i][j])
                {
                    min=arr[i][j];
                }
            }
        }
        System.out.println(min);
    }
}