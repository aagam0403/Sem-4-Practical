#include<iostream>
using namespace std;
bool isUpperTriangularMatrix(int mat[4][4])
{
    for(int i=0;i<4;i++)
    {
        for(int j=0;j<i;j++)
        {
            if(mat[i][j]!=0)
            {
                return false;
            }
        }
    }
    return true;
}
int main()
{
   int mat[4][4]=
   {
        {4, 6, 5, 3},
        {0, 7, 9, 6},
        {0, 0, 5, 1},
        {0, 0, 0, 1}
    };
    if (isUpperTriangularMatrix(mat))
    {
        cout << "Yes, it is a Upper Triangular Diagonal matrix";
    }
    else
    {
        cout << "No, it is not a Upper Traingular Diagonal matrix";
    }
	return 0;
}