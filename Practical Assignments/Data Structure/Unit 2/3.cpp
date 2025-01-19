#include <iostream>
using namespace std;
class node
{
    public :
        int data;
        node *next;
};
node *start=NULL;
node *rear=NULL;
node *create_ll(node *start)
{
    node *new_node;   
    int num;
    cout<<"Enter -1 to end"<<endl;
    cout<<"Enter the data = ";
    cin>>num;
    while(num!=-1)
    {
        new_node=new node;
        new_node->data=num;
        if(start==NULL)
        {
            new_node->next=NULL;
            start=new_node;
            rear=new_node;
        }
        else
        {
            rear->next=new_node;
            new_node->next=NULL;
            rear=new_node;
        }
        cout<<"Enter the data = ";
        cin>>num;
    }
    return start;
}

node *insert_after(node *start)
{
    node *ptr,*new_node,*preptr;
    int num,val;
    cout<<"Enter the data:";
    cin>>num;
    cout<<"Enter the value after which the data hase to be inserted:";
    cin>>val;
    new_node=new node();
    new_node->data = num;
    ptr= start;
    preptr=start;
    while(preptr->data != val)
    {
        preptr=ptr;
        ptr=ptr->next;
    }
    new_node->next = ptr;
    preptr->next= new_node;
    return start;
}

node *insert_beg(node *start)
{
    node *new_node;
    int num;
    cout<<"Enter the data:";
    cin>>num;
    new_node=new node();
    new_node->data = num;
    new_node->next= start;
    start=new_node;
    return start;
}

node *insert_end(node *start)
{
    node *ptr,*new_node;
    int num;
    cout<<"Enter the data:";
    cin>>num;
    new_node=new node();
    new_node->data = num;
    ptr=start;
    while(ptr->next != NULL)
    ptr= ptr->next;
    ptr->next= new_node;
    new_node->next = NULL;
    return start;
}

void display(node *start)
{
    node *ptr;
    ptr=start;
    if(start==NULL)
    {
        cout<<"List is empty"<<endl;
    }
    else
    {
        while(ptr->next!=NULL)
        {
            cout<<ptr->data<<"\t";
            ptr=ptr->next;
        }
        cout<<ptr->data<<endl;
    }
}
int main() {
    int option;
    do
    {
        cout<<"1. Create a Linked list"<<endl;
        cout<<"2. Insert in the middle"<<endl;
        cout<<"3. Insert in the Beginning"<<endl;
        cout<<"4. Insert in the end"<<endl;
        cout<<"5. Display Linked List"<<endl;
        cout<<"9. Exit"<<endl;
        cout<<"Enter Choice = ";
        cin>>option;
        switch(option)
        {
            case 1 :
            start=create_ll(start);
            break;
            
            case 2 :
            start=insert_after(start);
            break;
            
            case 3 :
            start=insert_beg(start);
            break;
            
            case 4 :
            start=insert_end(start);
            break;
            
            case 5 :
            display(start);
            break;
        }
    }
    while(option!=9);
    return 0;
}