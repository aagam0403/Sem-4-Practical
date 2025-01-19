//Program is to check wheather it is diagonal matrix or not
#include <iostream>
using namespace std;
bool isDiagonalMatrix(int diagmat[4][4])
{
    for(int i=0;i<4;i++)
    {
        for(int j=0;j<4;j++)
        {
            if(i!=j && diagmat[i][j]!=0)
            {
                return false;
            }
        }
    }
    return true;
}
int main() {
    int diagmat[4][4]=
    {
        {1,0,0,0},
        {0,2,0,0},
        {0,0,3,0},
        {0,0,0,4}
    };
    
    bool ans = isDiagonalMatrix(diagmat);
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