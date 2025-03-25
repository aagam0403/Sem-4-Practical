#include <iostream>
using namespace std;
int main()
{
    int i,j,temp,size,num;
    cout<<"Enter size of the array:";
    cin>>size;
    int arr[size];
    for(int i=0;i<size;i++)
    {
        cout<<"Enter elements:";
        cin>>arr[i];
    }
    for(int i=0;i<size-1;i++)
    {
        for(int j = 0;j<=(size-1)-i;j++)
        {
            if(arr[j] > arr[j+1])
            {
                temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
    }
    for(int i=0;i<size;i++)
    {
        cout<<"["<<arr[i]<<"]";
    }
}
