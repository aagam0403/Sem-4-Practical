#include <iostream>
using namespace std;

class node {
public:
    node *next;
    int data;
    node *prev;
};

node *start = NULL;
node *rear = NULL;

// Create a list
node *create_ll(node *start) {
    node *new_node;
    int num;
    cout << "Enter -1 to exit" << endl;
    cout << "Enter the data = ";
    cin >> num;
    while (num != -1) {
        new_node = new node();
        new_node->data = num;
        if (start == NULL) {
            start = new_node;
            new_node->prev = NULL;
            new_node->next = NULL;
            rear = new_node;
        } else {
            rear->next = new_node;
            new_node->prev = rear;
            new_node->next = NULL;
            rear = new_node;
        }
        cout << "\nEnter the Data : ";
        cin >> num;
    }
    return start;
}

// Display list
void display(node *start) {
    node *ptr;
    ptr = start;
    if (start == NULL) {
        cout << "List is empty\n";
    } else {
        while (ptr != NULL) {
            cout << ptr->data << "\t";
            ptr = ptr->next;
        }
        cout << endl;
    }
}

// Find the length of the linked list
int find_length(node *start) {
    int count = 0;
    node *ptr = start;
    while (ptr != NULL) {
        count++;
        ptr = ptr->next;
    }
    return count;
}

int main() {
    int option;
    do {
        cout << "1. Create a List" << endl;
        cout << "2. Display a List" << endl;
        cout << "3. Find the length of the List" << endl;
        cout << "9. Exit" << endl;
        cout << "Enter your Choice = ";
        cin >> option;
        switch (option) {
            case 1:
                start = create_ll(start);
                cout << "Linked List Created" << endl;
                break;
            case 2:
                display(start);
                break;
            case 3:
                cout << "Length of the List: " << find_length(start) << endl;
                break;
        }
    } while (option != 9);
    return 0;
}