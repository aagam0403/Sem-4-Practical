// Write a CPP program using switch case as below:
// 1. Create a circular single linked list
// 2. Delete a node in the beginning
// 3. Delete a node in the end
// 4. Delete a node from the middle
// 5. Display single circular linked list
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
node *delete_beg(node *start)
{
        node *ptr, *temp;
        ptr = start;
        while(ptr->next != start)
        ptr=ptr->next;
        ptr->next=start->next;
        temp=start;
        free(temp);
        start = ptr->next;
        return start;
}
node *delete_end(node *start)
{
        node *ptr,*preptr;
        ptr = start;
        while(ptr->next != start)
        {
        preptr=ptr;
        ptr= ptr->next;
        }
        preptr->next=start;
        free(ptr);
        return start;
}
node *delete_node(node *start)
{
        node *ptr,*preptr;
        int val;
        cout<<"Enter the value which you want to delete";
        cin>>val;
        ptr=start;
        if(ptr->data == val)
        {
            start=delete_beg(start);
            return start;
        }
        else
        {
            while(ptr->data != val)
            {
            preptr=ptr;
            ptr= ptr->next;
            }
            preptr->next=ptr->next;
            free(ptr);
            return start;
        }
}
int main()
{
int option;
do
{

    cout<<"\n 1:create a list";
    cout<<"\n 2: Display list";
    cout<<"\n 3:Delete node from the beginning";
    cout<<"\n 4:Delete node from the end";
    cout<<"\n 5:Delete a given node";
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
        start=delete_beg(start);
        break;
        case 4:
        start=delete_end(start);
        break;
        case 5:
        start=delete_node(start);
        break;
        }
    }while(option !=9);
    return 0;
}