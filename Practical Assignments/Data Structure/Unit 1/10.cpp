#include <iostream>
using namespace std;
bool isDiagonalMatrix(int mat[4][4])
{
    for (int i=0;i<4;i++)
    {
        for (int j=0;j<4;j++)
        {
            if (i!=j && mat[i][j] != 0)
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
        {0, 7, 0, 0}, 
        {0, 0, 5, 0}, 
        {0, 0, 0, 1}  
    };
    if (isDiagonalMatrix(mat))
    {
        cout << "Yes, it is a Diagonal Matrix";
        int sum=0;
        for(int i=0;i<4;i++)
        {
            sum+=mat[i][i];
        }
        cout<<endl<<"Sum of Diagonal values = "<<sum;
    }
    else
    {
        cout << "No, it is not a Diagonal Matrix";
    }
    return 0;
}