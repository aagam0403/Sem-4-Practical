//Program is to check wheather it is sparse matrix or not
#include <iostream>
using namespace std;
int main() {
    int sparsem[4][5]=
    {
        {0,3,4,5,6},
        {0,0,0,7,4},
        {3,4,5,6,0},
        {0,0,0,9,0}
    };
    int nz=0;
    int z=0;
    for(int i=0;i<4;i++)
    {
        for(int j=0;j<5;j++)
        {
            if (sparsem[i][j]!=0)
            {
                nz++;
            }
        }
    }
    cout<<"Total Non Zeroes Value in Matrix = "<<nz<<endl;
    
    for(int i=0;i<4;i++)
    {
        for(int j=0;j<5;j++)
        {
            if (sparsem[i][j]==0)
            {
                z++;
            }
        }
    }
    cout<<"Total Zeroes Value in Matrix = "<<z<<endl<<endl;
    
    if (z>nz)
    {
        cout<<"It is Sparse Matrix";
    }
    else
    {
        cout<<"It is not a Sparse Matrix";
    }
    return 0;
}