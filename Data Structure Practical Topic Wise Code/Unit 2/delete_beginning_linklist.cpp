//Creating a linked list, display and Delete at Beginning
#include <iostream>
using namespace std;
class node
{
    public :
        int data;
        node *next;
};
node *start=NULL;     //Head
node *rear=NULL;      //Tail

//Creating a list
node *create_ll(node *start)
{
    node *new_node;
    int num;
    cout<<"Enter -1 to end"<<endl;
    cout<<"Enter the data : ";
    cin>>num;
    while(num!=-1)
    {
        new_node = new node();
        new_node -> data=num;
        if(start==NULL)
        {
            new_node->next = NULL;
            start = new_node;
            rear = new_node;
        }
        else
        {
            rear->next=new_node;
            new_node->next=NULL;
            rear=new_node;
        }
        cout<<"Enter the data : "<<endl;
        cin>>num;
    }
    return start;
}

//Display a list
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

//Delete at beginning
node *delete_beg(node *start)
{
node *ptr;
if(start== NULL)
{cout<<"underflow";}
else
{
ptr=start;
start = start->next;
free(ptr);
}
return start;
}

int main() 
{
    int option;
    do
    {
        cout<<"1. Create a List"<<endl;
        cout<<"2. Display a List"<<endl;
        cout<<"3. Delet at Beginning"<<endl;
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
                start=delete_beg(start);
                break;
        }
    }
    while(option !=9);
    return 0;
}