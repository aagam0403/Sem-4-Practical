//cpp program for sparse matrix representation using array
#include <iostream>
using namespace std;
int main() {
    int sparsematrix[4][5] = {
        {0, 0, 3, 0, 4},
        {0, 0, 5, 7, 0},
        {0, 0, 0, 0, 0},
        {0, 2, 6, 0, 0}
    };

    int size = 0;

    // Count non-zero elements
    for (int i = 0; i < 4; i++) 
    {
        for (int j = 0; j < 5; j++) 
        {
            if (sparsematrix[i][j] != 0) 
            {
                size++;
            }
        }
    }

    // Create compact matrix
    int compactmatrix[3][size];
    int k = 0;

    for (int i = 0; i < 4; i++) 
    {
        for (int j = 0; j < 5; j++) 
        {
            if (sparsematrix[i][j] != 0) 
            {
                compactmatrix[0][k] = i;         // Row index
                compactmatrix[1][k] = j;         // Column index
                compactmatrix[2][k] = sparsematrix[i][j]; // Value
                k++;
            }
        }
    }

    // Print compact matrix
    cout << "Row\tColumn\tValue" << endl;
    for (int i = 0; i < size; i++) 
    {
         cout<< compactmatrix[0][i] << "\t"
             << compactmatrix[1][i] << "\t"
             << compactmatrix[2][i] << endl;
    }

    return 0;
}