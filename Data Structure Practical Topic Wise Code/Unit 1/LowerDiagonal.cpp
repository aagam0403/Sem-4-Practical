#include <iostream>
using namespace std;

// Function to check if a 4x4 matrix is a lower triangular matrix
bool isLowerTriangularMatrix(int mat[4][4])
{
    for (int i = 0; i < 4; i++)
    {
        for (int j = i + 1; j < 4; j++)
        {
            if (mat[i][j] != 0)
            {
                return false;//it is not a lower triangular matrix
            }
        }
    }
    return true; //it is a lower triangular matrix
}
int main()
{
    // Define a 4x4 matrix for testing
    int mat[4][4] = {
        {4, 0, 0, 0},  // First row
        {1, 7, 0, 0},  // Second row
        {8, 3, 5, 0},  // Third row
        {8, 5, 3, 1}   // Fourth row
    };

    // Check if the matrix is a lower triangular matrix and print the result
    if (isLowerTriangularMatrix(mat))
    {
        cout << "Yes, it is a Lower Triangular Diagonal Matrix";
    }
    else
    {
        cout << "No, it is not a Lower Triangular Diagonal Matrix";
    }

    return 0; // End of the program
}
