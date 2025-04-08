//SELECTION SORT
#include <iostream>
using namespace std;
void selectionSort(int arr[], int n)
{
    for(int i=0; i<n; i++)
    {
        int SmallestIdx = i; //assume that unsorted part starting
        for(int j=i+1; j<n; j++)
        {
            if(arr[j] < arr[SmallestIdx])
            {
                SmallestIdx=j;
            }
        }
        swap(arr[i],arr[SmallestIdx]);
    }
}
void printArray(int arr[], int n)
{
    for(int i=0; i<n; i++)
    {
        cout<< arr[i] << " ";
    }
    cout<<endl;
}
int main() 
{
    int n=5;
    int arr[] = {4,1,5,2,3};
    selectionSort(arr,n);
    printArray(arr,n);
    return 0;
}
