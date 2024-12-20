#include <iostream>
using namespace std;

// Function to check if a matrix is a diagonal matrix
bool isDiagonalMatrix(int mat[4][4])
{
    for (int i = 0; i < 4; i++)
    {
        for (int j = 0; j < 4; j++)
        {
            if (i != j && mat[i][j] != 0)
            {
                return false; // Not a diagonal matrix
            }
        }
    }
    return true; // It is a diagonal matrix
}
int main()
{
    int mat[4][4] = {
        {4, 0, 0, 0},
        {0, 7, 0, 0},
        {0, 0, 5, 0},
        {0, 0, 0, 1}
    };

    bool ans = isDiagonalMatrix(mat);
    if (ans)
    {
        cout << "Yes, it is a diagonal matrix";
    }
    else
    {
        cout << "No, it is not a diagonal matrix";
    }
    return 0;
}
