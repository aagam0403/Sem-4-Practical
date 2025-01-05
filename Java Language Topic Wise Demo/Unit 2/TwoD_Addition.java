import java.util.*;
class TwoD_Addition
{
    public static void main(String[] args) {
        int matrix1[][]=new int[3][3];
        int matrix2[][]=new int[3][3];
        Scanner s=new Scanner(System.in);
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.println("Enter value for matrix1["+i+"]["+j+"]");
                matrix1[i][j]=s.nextInt();
                System.out.println("Enter value for matrix1["+i+"]["+j+"]");
                matrix2[i][j]=s.nextInt();
            }
        }
        System.out.println("Matrix1");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.println(matrix1[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("Matrix2");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.println(matrix2[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("Matrix after Addition");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.println((matrix1[i][j]+matrix2[i][j])+"\t");
        }
    }
}}