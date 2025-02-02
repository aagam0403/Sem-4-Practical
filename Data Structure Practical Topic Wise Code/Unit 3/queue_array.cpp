#include <iostream>
#define MAX 101
using namespace std;
int queue[MAX];
int front = -1, rear = -1;
void enqueue() {
    int num;
    cout << "Enter number to insert: ";
    cin >> num;

    if (rear == MAX - 1) {
        cout << "Queue is FULL (Overflow)\n";
        return;
    }

    if (front == -1) front = 0;
    rear++;
    queue[rear] = num;
    cout << num << " added to queue.\n";
}

void dequeue() 
{
    if (front == -1 || front > rear) 
    {
        cout << "Queue is EMPTY (Underflow)\n";
        return;
    }
    cout << "Removed: " << queue[front] << endl;
    if (front == rear)
    {
        front = rear = -1;
    }
    else
    {
        front++;
    }
}

void peek() 
{
    if (front == -1 || front > rear)
    {
        cout << "Queue is EMPTY\n";
    }
    else
    {
        cout << "Front element: " << queue[front] << endl;
    }
}

void display() 
{
    if (front == -1 || front > rear) 
    {
        cout << "Queue is EMPTY\n";
        return;
    }
    cout << "Queue elements: ";
    for (int i = front; i <= rear; i++)
    {
        cout << queue[i] << " ";
    }
    cout << endl;
}

int main() 
{
    int choice;
    do 
    {
        cout << "\nMENU:\n1. Insert\n2. Delete\n3. Peek\n4. Display\n5. Exit\nEnter choice: ";
        cin >> choice;

        switch (choice) 
        {
            case 1: enqueue(); break;
            case 2: dequeue(); break;
            case 3: peek(); break;
            case 4: display(); break;
            case 5: cout << "Exiting...\n"; break;
            default: cout << "Invalid choice! Try again.\n";
        }
    } 
    while (choice != 5);
    return 0;
}