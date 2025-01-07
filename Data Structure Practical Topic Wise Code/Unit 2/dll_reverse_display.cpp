//Write a program to create double linked list and display reverse list
#include <iostream>
using namespace std;
class node
{
    public :
        node *next;
        int data;
        node *prev;
};
node *start=NULL;
node *prev=NULL;
node *rear=NULL;

//create a list
node *create_ll(node *start)
{
    node *new_node;
    int num;
    cout<<"Enter -1 to exit"<<endl;
    cout<<"Enter the data = ";
    cin>>num;
    while(num!=-1)
    {
        new_node = new node();
        new_node -> data=num;
        if(start==NULL)
        {
            start=new_node;
            new_node->prev=NULL;
            new_node->next=NULL;
            rear=new_node;
        }
        else
        {
            rear->next=new_node;
            new_node->prev=rear;
            new_node->next=NULL;
            rear=new_node;
        }
        cout<<"\nEnter the Data : ";
        cin>>num;
    }
    return start;
}
//display reverse list
void display(node* start) 
{
    node* ptr = start;
    while (ptr->next != NULL) 
    {
        ptr = ptr->next;
    }
    while (ptr != NULL) 
    {
        cout << ptr->data << "\t";
        ptr = ptr->prev;
    }
    cout << endl;
}


int main() 
{
    int option;
    do
    {
        cout<<"1. Create a List"<<endl;
        cout<<"2. Reverse Display a List"<<endl;
        cout<<"9. Exit"<<endl;
        cout<<"Enter your Choice = "<<endl;
        cin>>option;
        switch(option)
        {
            case 1:
                start=create_ll(start);
                cout<<"Linked List Created"<<endl;
                break;
            case 2:
                display(start);
                break;
        }
    }
    while(option !=9);
    return 0;
}