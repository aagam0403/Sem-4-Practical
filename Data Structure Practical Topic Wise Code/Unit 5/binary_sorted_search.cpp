// only for sorted array
#include<iostream>
using namespace std;
int main()
{
    int arr[5],no,i=0,num,n,beg,end,mid,found=0;
    cout<<"enter the size of array : ";
    cin>>no;
    for(i=0;i<no;i++)
    {
        cout<<" enter the no : ";
        cin>>arr[i];
    }
    cout<<" enter the number to search : ";
    cin>>num;
    beg=0;end=no-1;
    while(beg<=end)
    {
        mid=(beg+end)/2;
        if(arr[mid]==num)
        {
            cout<<num<<" is present in array at possition"<<mid+1<<endl;
            found=1;
            break;
        }
        else if(arr[mid]>num)
        {
            end = mid-1;
        }ṇ
        else
        {
            beg=mid+1;
        }
    }
    if(found==0)
    {
        cout<<" Not Exist"<<endl;
    }
}