#include<iostream>
#define MAX 10
using namespace std;
int queue[MAX];
int front = -1, rear = -1;
void enqueue()
{
	int num;
	cout<<"Enter the Number to be inserted in the queue";
	cin>>num;
	if(rear == MAX-1)
	{
		cout<<"Queue is overflow";
	}
	else
	{
		if(front == -1 && rear == -1)
		{
			front = rear = 0;
		}
		else
		{
			rear++;
		}
		queue[rear]=num;
	}
}
int dequeue()
{
	int val;
	if(front == -1)
	{
		cout<<endl<<"Queue Underflow Empty";
	}
	else
	{
		val = queue[front];
		front++;
	}
	return val;
}
int peek()
{
	return (queue[front]);
}
void display()
{
	if(front == -1 || front>rear)
	{
		cout<<"Queue is Empty Undeflow";
	}
	else
	{
		cout<<endl;
		for(int i=front; i<=rear; i++)
		{
			cout<<queue[i]<<" ";
		}
	}
}
int main()
{
	int val,option;
	do
	{
		cout<<endl<<"***MAIN MENU***"<<endl;
		cout<<"1: Insert a Element"<<endl;
		cout<<"2: Delete a Element"<<endl;
		cout<<"3: Peek"<<endl;
		cout<<"4: Display"<<endl;
		cout<<"5: Exit"<<endl;
		cin>>option;
		switch(option)
		{
		case 1: enqueue();
			break;

		case 2: val=dequeue();
			cout<<"The Value deleted from the queue is: "<<val<<endl;
			break;

		case 3: val = peek();
			cout<<"The First Value is the queue is: "<<val;
			break;

		case 4: display();
			break; 
		}
	}
	while(option != 5);
	return 0;
}
