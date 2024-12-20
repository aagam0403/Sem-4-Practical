//Diagonal Matrix
#include <iostream>
using namespace std;
bool isDiagonalMatrix(int mat[4][4])
{
    for(int i=0;i<4;i++)
    {
        for(int j=0;j<4;j++)
        {
            if ((i!=j) && (mat[i][j]==0))
            {
                return true;
            }
        }
    }
    return 0;
}
int main() 
{
    int mat[4][4] = {
        {4,0,0,0},
        {0,7,0,0},
        {0,0,5,0},
        {0,0,0,1}
    };
    bool ans=false;
    ans=isDiagonalMatrix(mat);
    if(ans)
    {
        cout<<"Yes, It is Diagonal Matrix";
    }
    else
    {
        cout<<"No, It is Diagonal Matrix";
    }
    return 0;
}