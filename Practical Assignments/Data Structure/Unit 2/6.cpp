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

node *delete_beg(node *start)
{
    node *ptr;
    if(start== NULL)
    {
        cout<<"Underflow"; 
    }
    else
    {
    if(start->next==NULL)
    {
        ptr=start;
        free(ptr);
        cout<<"node is deleted\n";
        start= NULL;
    }
    else
    {
        ptr = start;
        start = start->next;
        start->prev=NULL;
        free(ptr);
        cout<<"node is deleted\n";
    }
}
return start;
}

node *delete_end(node *start)
{
    node *ptr,*preptr;
    ptr=rear;
    preptr=rear->prev;
    free(ptr);
    rear=preptr;
    preptr->next=NULL;
    return start;
}

node *delete_after(node *start)
{
    node *ptr,*temp1;
    ptr=start;
    int num;
    cout<<" enter a value after you want to delete : ";
    cin>>num;
    while(ptr->data!=num)
    {
        ptr=ptr->next;
    }
    temp1=ptr->prev;
    temp1->next=ptr->next;
    ptr->next->prev=temp1;
    free(ptr);
    return start;
}

int main() 
{
    int option;
    do
    {
        cout<<"1. Create a List"<<endl;
        cout<<"2. Display a List"<<endl;
        cout<<"3. Delete at Beginning"<<endl;
        cout<<"4. Delete at End"<<endl;
        cout<<"5. Delete after a node"<<endl;
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
                start =delete_beg(start);
                break;
            case 4 :
                start=delete_end(start);
                break;
            case 5 :
                start=delete_after(start);
                break;
        }
    }
    while(option !=9);
    return 0;
}