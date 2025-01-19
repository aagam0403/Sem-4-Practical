#include <iostream>
using namespace std;
int main() 
{
    int n;
    cout<<"Enter n Values of Array = ";
    cin>>n;
    int mat[n];
    for(int i=0;i<n;i++)
    {
        cout<<"Enter the Values = ";
        cin>>mat[i];
    }
    
    cout<<endl<<"Printing Array"<<endl;
    for(int i=0;i<n;i++)
    {
        cout<<mat[i]<<" ";
    }
    
    cout<<endl<<"Reverse Printing"<<endl;
    for(int i=n-1;i>=0;i--)
    {
        cout<<mat[i]<<" ";
    }
    return 0;
}