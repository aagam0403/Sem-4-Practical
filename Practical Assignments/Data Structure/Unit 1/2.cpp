//Take user input of single matrix and print it
#include <iostream>
using namespace std;
int main() {
    int n;
    cout<<"Enter the n values you want to enter = ";
    cin>>n;
    int mat[n];
    for(int i=0;i<n;i++)
    {
        cout<<"Enter the Values = ";
        cin>>mat[i];
    }
    cout<<endl<<"-------------------------------"<<endl;
    cout<<"Printing matrix : ";
    for(int i=0;i<n;i++)
    {
        cout<<mat[i]<<" ";
    }
    cout<<endl<<"-------------------------------"<<endl;
    return 0;
}