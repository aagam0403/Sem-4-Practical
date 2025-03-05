#include <iostream>
using namespace std;
int main()
{
    int size,num,temp,found=0;   
    cout<<"Enter size of the array:";
    cin>>size;

    int arr[size];
    for(int i=0;i<size;i++)
    {
        cout<<"Enter elements:";
        cin>>arr[i];
    }

    cout<<"Enter number to search:";
    cin>>num;

    for(int i=0;i<size;i++)
    {
        if(arr[i] == num)
        {
            cout<<"Found!!!";
            found = 1;
            break;
        }
    }
    if(found != 1)
    {
        cout<<"Not Found!!";
    }
    return 0;
}