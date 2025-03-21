#include<iostream>
using namespace std;
#define MAX 10
int queue[MAX];
int front=-1,rear=-1;
void enqueue()
{
    int val;
    cout<<"Enter Value:";
    cin>>val;
    if(rear==MAX-1)
    {
        cout<<"QUEUE OVERFLOW!!!";
    }
    else
    {
        if(front==-1 && rear==-1)
        {
            front ++;
            rear++;
        }
        else
        {
            rear++;
        }
        queue[rear]=val;

    }
}
void sort()
{
    int temp;
    int i,j;
    for(i=1;i<MAX;i++)
    {
        for(j=0;j<i;j++)
        {
            if(queue[i]<queue[j])
            {
                temp=queue[i];
                queue[i]=queue[j];
                queue[j]=temp;   
            }
        }
    }
    for(i=front;i<=rear;i++)
    {
        cout<<queue[i]<<endl;
    }
}
int main()
{
    for(int i=0;i<10;i++)
    {
        enqueue();
    }
    cout<<"SORTED QUEUE"<<endl;
    sort();
}



/*DECENDING ONE

#include<iostream>
using namespace std;
#define MAX 10
int queue[MAX];
int front=-1,rear=-1;
void enqueue()
{
    int val;
    cout<<"Enter Value:";
    cin>>val;
    if(rear==MAX-1)
    {
        cout<<"QUEUE OVERFLOW!!!";
    }
    else
    {
        if(front==-1 && rear==-1)
        {
            front ++;
            rear++;
        }
        else
        {
            rear++;
        }
        queue[rear]=val;

    }
}
void sort()
{
    int temp;
    int i,j;
    for(i=1;i<MAX;i++)
    {
        for(j=0;j<i;j++)
        {
            if(queue[i]>queue[j])
            {
                temp=queue[i];
                queue[i]=queue[j];
                queue[j]=temp;   
            }
        }
    }
    for(i=front;i<=rear;i++)
    {
        cout<<queue[i]<<endl;
    }
}
int main()
{
    for(int i=0;i<10;i++)
    {
        enqueue();
    }
    cout<<"SORTED QUEUE"<<endl;
    sort();
}
*/