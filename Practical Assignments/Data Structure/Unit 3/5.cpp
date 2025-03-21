#include<iostream>
using namespace std;
#define MAX 10
int queue[MAX],front=-1,rear=-1;
void enqueue()
{
    int val;
    cout<<"Enter Value For The Elements:";
    cin>>val;
    if(rear>=MAX-1)
    {
        cout<<"QUEUE OVERFLOW!!!";
    }
    else if(front==-1 && rear==-1)
    {
        front ++;
        rear++;
        queue[rear]=val;
    }
    else if(front!=0 && rear==MAX-1)
    {
        rear++;
        queue[rear]=val;
    }
    else
    {
        rear++;
        queue[rear]=val;
    }
}
void dequeue()
{
    if(front==-1)
    {
        cout<<"QUEUE UNDERFLOW!!";
    }
    else
    {
        if(front==rear)
        {
            front=rear=-1;
        }
        else if(front==MAX-1)
        {
            front=0;
        }
        else
        {
            front++;
        }
    }
}
void display()
{
    if(front==-1)
    {
        cout<<"QUEUE UNDERFLOW!!";
    }
    else
    {
        if(front!=-1 && rear!=-1)
        {
            if(front<=rear)
            {
                for(int i=front ;i<=rear;i++)
                {
                    cout<<queue[i]<<endl;
                }
            }
            else
            {
                for(int i=front; i<MAX;i++)
                {
                    cout<<queue[i]<<endl;
                }
                for(int i=0;i<=rear;i++)
                {
                    cout<<queue[i]<<endl;
                }
            }
        }
    }
}
void peek()
{
    cout<<queue[front]<<endl;
}
int main()
{
    int choice;
    cout<<"Menu"<<endl;
    cout<<"1.Enqueue"<<endl;
    cout<<"2.Dequeue"<<endl;
    cout<<"3.Peek"<<endl;
    cout<<"4.Display"<<endl;
    cout<<"5.Exit"<<endl;
    cout<<"Enter Choice:";
    cin>>choice;
    while(choice<=5)
    {
        switch(choice)
    {
        case 1:enqueue();
        break;
        case 2:dequeue();
        break;
        case 3:peek();
        break;
        case 4:display();
        break;
        case 5:exit(0);
        break;
        default:cout<<"Enter Correct Choice!!!";
    }
    cout<<"Enter Choice:";
    cin>>choice;
    }

}