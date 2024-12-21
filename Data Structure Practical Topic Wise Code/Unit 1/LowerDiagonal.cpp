#include <iostream>
using namespace std;
bool isLowerTriangularMatrix(int mat[4][4])
{
    for (int i=0;i<4;i++)
    {
        for (int j=i+1;j<4;j++)
        {
            if (mat[i][j]!=0)
            {
                return false;
            }
        }
    }
    return true;
}
int main()
{
    int mat[4][4] = {
        {4, 0, 0, 0},
        {1, 7, 0, 0},
        {8, 3, 5, 0},
        {8, 5, 3, 1}
    };
    if (isLowerTriangularMatrix(mat))
    {
        cout << "Yes, it is a Lower Triangular Diagonal Matrix";
    }
    else
    {
        cout << "No, it is not a Lower Traingular Diagonal Matrix";
    }
    return 0;
}