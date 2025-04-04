//Create  a single circular link list and display the same
#include<iostream>
using namespace std;
class node
{
    public:
        int data;
        node *next;
};
node *start= NULL;
node *rear= NULL;

//Creating a list
node *create_ll(node *start)
{
    node *new_node, *ptr;
    int num;
    cout<<"Enter -1 to end";
    cout<<"Enter the data:";
    cin>>num;
    while(num != -1)
    {
        new_node=new node();
        new_node -> data=num;
        if(start==NULL)
        {
            start= new_node;
            new_node->next=start;
            rear=new_node;
        }
        else
        {
            rear->next=new_node;
            new_node->next=start;
            rear=new_node;
        }
        cout<<"Enter the data:";
        cin>>num;
    }
    return start;
}

//Displaying the list
node *display(node *start)
{
    node *ptr;
    ptr = start;
    cout<<endl;
    if(start==NULL)
    {
        cout<<"List is empty"<<endl;
    }
    else
    {
        while(ptr->next != start)
        {
            cout<<" " << ptr->data<<" ";
            ptr= ptr->next;
        }
    cout<<ptr->data;
    }
    return start;
}

int main()
{
    int option;
    do
    {
        cout<<"1:Create a list";
        cout<<"\n 2:Display list";
        cout<<"\n 9:Exit";
        cout<<"\n Enter your choice:";
        cin>>option;
    switch(option)
    {
    case 1:
        start = create_ll(start);
        cout<<"\n LINKED LIST CREATED";
        break;
    case 2:
        start= display(start);
        break;
    }
    }
    while(option !=9);
    return 0;
}