#include <iostream>
using namespace std;
int stack[5],n=5,top=-1;
void push(int val)
{
    if (top>=n-1)
    {
        cout<<"Stack Overflow"<<endl;
    }
    else
    {
        top++;
        stack[top]=val;
    }
}
void pop()
{
    if(top<=-1)
    {
        cout<<"Stack Underflow"<<endl;
    }
    else
    {
        cout<<"The Popped Element is "<<stack[top]<<endl;
        top--;
    }
}
void peek()
{
    cout<<"The Popped Element is "<<stack[top]<<endl;
}

void display()
{
    if(top>=0)
    {
        cout<<"Stack Elements are : ";
        for(int i=top;i>=0;i--)
        {
            cout<<stack[i]<<" ";
            cout<<endl;
        }
    }
    else
    {
        cout<<"Stack is Empty";
    }
}
int main() 
{
    int option;
    cout<<"1. Enter the Data (Push)"<<endl;
    cout<<"2. Remove the Data (Pop)"<<endl;
    cout<<"3. Last Element (Peek)"<<endl;
    cout<<"4. Display the Full Stack"<<endl;
    do
    {
        cout<<"Enter the Choice"<<endl;
        cin>>option;
        switch(option)
        {
            case 1 :
                int val;
                cout<<"Enter the Data = ";
                cin>>val;
                push(val);
                break;
                
            case 2 :
                pop();
                break;
                
            case 3 :
                peek();
                break;
                
            case 4 :
                display();
                break;
        }
    }
    while(option!=9);
    return 0;
}
