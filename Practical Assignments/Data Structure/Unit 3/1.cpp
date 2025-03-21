#include<iostream>
using namespace std;
int stack[10],n=10,top=-1;
void push()
{
    if(top>=n-1)
    {
        cout<<"STACK OVERFLOW!!!";
    }
    else
    {
        int val;
        cout<<"Enter Value For The Element TO Push:";
        cin>>val;
        top++;
        stack[top]=val;
    }
}
void display()
{
    for(int i=top;i>=0;i--)
    {
        if(stack[i]%2!=0)
    {
        cout<<stack[i]<<endl;
    }
    }
}
int main()
{
    for(int i=0;i<10;i++)
    {
        push();
    }
    cout<<"Displaying All The Odd Eleemnts From The Stack:"<<endl;
    display();
}