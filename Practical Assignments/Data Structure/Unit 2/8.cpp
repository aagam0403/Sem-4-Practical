// Write a CPP program using switch case as below:
// 1. Create a circular single linked list
// 2. Insert a node in the beginning
// 3. Insert a node in the end
// 4. Insert a node in the middle
// 5. Display circular linked list
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
node *create_ll(node *start)
{
    node *new_node, *ptr;
    int num;
    cout<<"Enter -1 to end"<<endl;
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
node *insert_end(node *start)
{
        node *ptr,*new_node;
        int num;
        cout<<"Enter the data:";
        cin>>num;
        new_node=new node();
        new_node->data = num;
        new_node->next = start;
        ptr= start;
        while(ptr->next != start)
        ptr= ptr->next;
        ptr->next= new_node;
        return start;
}
node *insert_after(node *start)
{
        node *ptr,*new_node,*preptr;
        int num,val;
        cout<<"Enter the data:";
        cin>>num;
        cout<<"Enter the value before which the data has to be inserted"<<endl;
        cin>>val;
        new_node=new node();
        new_node->data = num;
        ptr= start;
        preptr=ptr;
        while(preptr->data != val)
        {
        preptr=ptr;
        ptr=ptr->next;
        }
        preptr->next = new_node;
        new_node->next= ptr;
        return start;
}
int main()
{
int option;
do
{

    cout<<"\n 1:create a list";
    cout<<"\n 2: Display list";
    cout<<"\n 3:Add a node in the beginning";
    cout<<"\n 4:Add a node at the end";
    cout<<"\n 5:Add a node before a given node";
    cout<<"\n 9:Exit";
    cout<<"\n \n Enter your choice:";
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
        case 4:
        start=insert_end(start);
        break;
        case 5:
        start=insert_after(start);
        break;
        }
    }while(option !=9);
    return 0;
}