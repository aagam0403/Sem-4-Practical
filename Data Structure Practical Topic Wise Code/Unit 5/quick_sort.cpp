#include<iostream>
using namespace std;
  
// A utility function to swap two elements 
void swap(int* a, int* b) 
{ 
    int t = *a; 
    *a = *b; 
    *b = t; 
} 
  
int partition (int arr[], int low, int high) 
{ 
    int pivot = arr[high];    // pivot 
    int i = (low - 1);  // Index of smaller element 
  
    for (int j = low; j <= high- 1; j++) 
    { 
        // If current element is smaller than the pivot 
        if (arr[j] < pivot) 
        { 
            i++;    // increment index of smaller element 
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
        /* pi is partitioning index, arr[p] is now 
           at right place */
        int pi = partition(arr, low, high); 
	    cout<<endl;
	  //  cout<<pi<<endl;
          // Separately sort elements before 
       // partition and after partition 
        quickSort(arr, low, pi - 1); 
        quickSort(arr, pi + 1, high); } } 
  /* Function to print an array */
void printArray(int arr[], int size) 
{ 
    int i; 
    for (i=0; i < size; i++) 
	cout<<arr[i]<<endl;
    cout<<endl; 
}   
// Driver program to test above functions 
int main() 
{ 
    int arr[] = {10, 7, 8, 9, 1, 5}; 
    int n= 6;
   // int n = sizeof(arr)/sizeof(arr[0]); 
    quickSort(arr, 0, n-1); 
    cout<<"sorted array";
	printArray(arr, n); 
    return 0; 
} 

