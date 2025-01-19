// Write a CPP program using switch case as below:
// 1. Create a double linked list
// 2. Insert a node in the ending
// 3. Insert a node in the beginning
// 4. Insert a node in the middle
// 5. Display double linked list
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

node *insert_beg(node *start)
{
    node *new_node;
    int num;
    cout<<"Enter the data:";
    cin>>num;
    new_node=new node;
    new_node->data = num;
    new_node->prev = NULL;
    new_node->next= start;
    start=new_node;
    return start;
}

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

node *insert_after(node *start)
{
    node *ptr,*new_node;
    int num,val;
    cout<<"\n Enter the data:";
    cin>>num;
    cout<<"Enter the value after which the data hase to be inserted:";
    cin>>val;
    new_node=new node;
    new_node->data = num;
    ptr= start;
    while(ptr->data != val)
    {
        ptr=ptr->next;
    }
    new_node->prev=ptr;
    new_node->next = ptr->next;
    ptr->next->prev=new_node;
    ptr->next= new_node;
    return start;
}
int main() 
{
    int option;
    do
    {
        cout<<"1. Create a List"<<endl;
        cout<<"2. Display a List"<<endl;
        cout<<"3. Insert a node in the beginning"<<endl;
        cout<<"4. Insert a node in the end"<<endl;
        cout<<"5. Insert a node in the middle"<<endl;
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
            case 3 :
                start = insert_beg(start);
                break;
            case 4 :
                start = insert_end(start);
                break;
            case 5 :
                start = insert_after(start);
                break;
        }
    }
    while(option !=9);
    return 0;
}