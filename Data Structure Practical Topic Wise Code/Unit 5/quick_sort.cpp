#include<iostream>
using namespace std;
void swap(int* a, int* b) 
{ 
    int t = *a; 
    *a = *b; 
    *b = t; 
}   
int partition (int arr[], int low, int high) 
{ 
    int pivot = arr[high]; 
    int i = (low - 1);  
    for (int j = low; j <= high- 1; j++) 
    { 
        if (arr[j] < pivot) 
        { 
            i++;
            swap(&arr[i], &arr[j]); 
        } 
    } 
	i++;
    swap(&arr[i], &arr[high]); 
    return i; 
} 
void quickSort(int arr[], int low, int high) 
{ 
    if (low < high) 
    { 
        int pi = partition(arr, low, high); 
	    cout<<endl;
        quickSort(arr, low, pi - 1); 
        quickSort(arr, pi + 1, high); } } 
void printArray(int arr[], int size) 
{ 
    int i; 
    for (i=0; i < size; i++) 
	cout<<arr[i]<<endl;
    cout<<endl; 
}   
int main() 
{ 
    int arr[] = {10, 7, 8, 9, 1, 5}; 
    int n= 6;
    quickSort(arr, 0, n-1); 
    cout<<"sorted array";
	printArray(arr, n); 
    return 0; 
} 
