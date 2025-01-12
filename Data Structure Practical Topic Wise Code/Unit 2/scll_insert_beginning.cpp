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

//Insert at Beginning
node *insert_beg(node *start)
{
    node *new_node,*ptr;
    int num;
    cout<<"Enter the data:";
    cin>>num;
    new_node=new node();
    new_node->data = num;
    ptr=start;
    while(ptr->next != start)
    ptr=ptr->next;
    ptr->next=new_node;
    new_node ->next= start;
    start=new_node;
    return start;
}

int main()
{
    int option;
    do
    {
        cout<<"\n1:Create a list";
        cout<<"\n2:Display list";
        cout<<"\n3:Insert Beginning the node";
        cout<<"\n9:Exit";
        cout<<"\nEnter your choice:";
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
    case 3: 
        start=insert_beg(start);
        break;
    }
    }
    while(option !=9);
    return 0;
}