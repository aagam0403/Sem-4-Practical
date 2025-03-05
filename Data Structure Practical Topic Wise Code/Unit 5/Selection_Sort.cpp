#include <iostream>
using namespace std;
int main()
{
    int size;

    cout<<"Enter size of array:";
    cin>>size;

    int arr[size];

    for(int i=0;i<size;i++)
    {
        cout<<"Enter elements:";
        cin>>arr[i];
    }

    for(int i=0;i<size;i++)
    {
        cout<<"["<<arr[i]<<"]";
    }

    int pos,smallest,temp;
    smallest = arr[0];
    for(int i=0;i<size-1;i++)
    {
        for(int j=0;j<(size-1)-i;j++)
        {
            if(arr[j]<smallest)
            {
                temp = smallest;
                smallest = arr[j];
                arr[j] = smallest;
            }
        }
    }
    
    for(int i=0;i<size;i++)
    {
        cout<<"["<<arr[i]<<"]";
    }
}