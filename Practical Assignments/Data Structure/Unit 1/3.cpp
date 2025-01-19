//Take user input of 2d matrix and print it
#include <iostream>
using namespace std;
int main() {
    int r,c;
    cout<<"Enter the Rows = ";
    cin>>r;
    cout<<"Enter the Cols = ";
    cin>>c;
    int mat[r][c];
    for(int i=0;i<r;i++)
    {
        for(int j=0;j<c;j++)
        {
            cout<<"Enter the Values = ";
            cin>>mat[i][j];
        }
    }
    
    cout<<endl<<"Printing matrix : "<<endl;
    for(int i=0;i<r;i++)
    {
        for(int j=0;j<c;j++)
        {
            cout<<mat[i][j]<<" ";
        }
        cout<<endl;
    }
    return 0;
}