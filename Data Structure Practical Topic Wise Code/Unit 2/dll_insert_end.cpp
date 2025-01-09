//Write a program to create double linked list & insert a new node in end
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
    cout<<"Enter the Data = ";
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
        cout<<"Enter the Data : ";
        cin>>num;
    }
    return start;
}
//display list (as same as singly linked list)
void display(node *start)
{
    node *ptr;
    ptr=start;
    if(start==NULL)
    {
        cout<<"List is empty\n";
    }
    else
    {
        while(ptr->next != NULL)
        {
            cout<<ptr->data<<"\t";
            ptr=ptr->next;
        }
        cout<<ptr->data<<endl;
    }
}

//Insert at End
node *insert_end(node *start)
{
    node *ptr, *new_node;
    int num;
    cout<<"Enter the data:";
    cin>>num;
    new_node=new node;
    new_node->data = num;
    new_node->next = NULL;
    new_node->prev = rear;
    rear->next=new_node;
    rear=new_node;
    return start;
}

int main() 
{
    int option;
    do
    {
        cout<<"1. Create a List"<<endl;
        cout<<"2. Display a List"<<endl;
        cout<<"3. Insert at End"<<endl;
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
            case 3:
                start=insert_end(start);
                break;
        }
    }
    while(option !=9);
    return 0;
}