#include <iostream>
using namespace std;
class node
{
public:
    int data;
    node *next;
};
node *front;
node *rear;
void insert()
{
    node *ptr;
    int item;
    cout << "\nEnter value:\n";
    cin >> item;
    ptr = new node();
    ptr->data = item;
    if (front == NULL)
    {
        front = ptr;
        rear = ptr;
        ptr->next = NULL;
    }
    else
    {
        rear->next = ptr;
        rear = ptr;
        ptr->next = NULL;
    }
}
void delete1()
{
    node *ptr;
    if (front == NULL)
    {
        cout << "\nUNDERFLOW\n";
        return;
    }
    else
    {
        ptr = front;
        front = front->next;
        cout << "\nthe value being deleted is:" << ptr->data;
        free(ptr);
    }
}
void display()
{
    node *ptr;
    ptr = front;
    if (front == NULL)
    {
        cout << "\nEmpty queue\n";
    }
    else
    {
        while (ptr != NULL)
        {
            cout << "\t" << ptr->data;
            ptr = ptr->next;
        }
    }
}
int peek()
{
    node *ptr;
    ptr = front;
    return ptr->data;
}
int main()
{
    int choice, val;
    while (choice != 5)
    {
        cout << "\n****************Main Menu*****************\n";
        cout << "\n1.insert an element\n2.Delete an element\n3.Display the queue\n4.peek\n5.Exit\
n";
        cout << "\nEnter your choice ?";
        cin >> choice;
        switch (choice)
        {
        case 1:
            insert();
            break;
        case 2:
            delete1();
            break;
        case 3:
            display();
            break;
        case 4:
            val = peek();
            cout << "\n value at the front end:" <<val<< endl;
            break;
        case 5:
            exit(0);
            break;
        default:
            cout << "\nEnter valid choice??\n";
        }
    }
}
