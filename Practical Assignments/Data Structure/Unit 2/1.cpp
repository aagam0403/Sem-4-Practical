// // Write a CPP program using switch case as below:
// // 1. Create a single linked list (Sorted Linked List)
// // 2. Display single linked list
// // 3. Remove the duplicate value (if any) 
#include <iostream>
using namespace std;

class node {
public:
    int data;
    node* next;
};

node* start = NULL;
node* rear = NULL; 

// Create a sorted linked list
node* create_ll(node* start) {
    node* new_node;
    int num;
    cout << "Enter -1 to quit: " << endl;
    cout << "Enter the data: ";
    cin >> num;
    while (num != -1) 
    {
        new_node = new node();
        new_node->data = num;
        if (start == NULL) 
        {
            new_node->next = NULL;
            start = new_node;
            rear = new_node;
        } 
        else 
        {
            node* temp = start;
            node* prev = NULL;
            while (temp != NULL && temp->data < num) 
            {
                prev = temp;
                temp = temp->next;
            }
            if (prev == NULL)
            {
                new_node->next = start;
                start = new_node;
            } else 
            {
                new_node->next = temp;
                prev->next = new_node;
            }
            if (temp == NULL)
            {
                rear = new_node;
            }
        }
        cout << "Enter the data: ";
        cin >> num;
    }
    return start;
}

// Display linked list
void display_ll(node* start) {
    node* ptr = start;
    if (start == NULL) {
        cout << "List is empty" << endl;
    } else {
        while (ptr != NULL) {
            cout << ptr->data << "\t";
            ptr = ptr->next;
        }
        cout << endl;
    }
}

// Remove duplicate values
node *remove_duplicates(node *start) {
    if (start == NULL)
    {
         return start;
    }
    node *ptr, *temp;
    ptr=start;
    while (ptr->next != NULL) 
    {
        if (ptr->data == ptr->next->data) 
        {
            temp = ptr->next;
            ptr->next = temp->next;
            delete temp;
        } 
        else 
        {
            ptr = ptr->next;
        }
    }
    return start;
}

int main() {
    int option;
    do {
        cout << "1. Create a sorted linked list" << endl;
        cout << "2. Display the linked list" << endl;
        cout << "3. Remove duplicate values" << endl;
        cout << "9. Exit" << endl;
        cout << "Enter your choice: ";
        cin >> option;
        switch (option) {
            case 1:
                start = create_ll(start);
                break;
            case 2:
                display_ll(start);
                break;
            case 3:
                start = remove_duplicates(start);
                cout << "Duplicates removed (if any)." << endl;
                break;
            case 9:
                cout << "Exiting..." << endl;
                break;
            default:
                cout << "Invalid option, please try again." << endl;
        }
    } while (option != 9);

    return 0;
}