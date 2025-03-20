#include <iostream>
using namespace std;

class Stack {
public:
    int data;
    Stack* next;
};

Stack* top = NULL;

Stack* push(Stack* top) {
    Stack* New_Node = new Stack();
    int val;
    cout << "Enter the number to be pushed onto the stack: ";
    cin >> val;
    New_Node->data = val;

    if (top == NULL) {
        top = New_Node;
        top->next = NULL;
    } else {
        New_Node->next = top;
        top = New_Node;
    }

    return top;
}

Stack* pop(Stack* top) {
    if (top == NULL) {
        cout << "Stack is underflow." << endl;
    } else {
        Stack* ptr = top;
        top = top->next;
        cout << "The value being deleted is: " << ptr->data << endl;
        delete ptr;
    }
    return top;
}

void peep(Stack* top) {
    if (top == NULL) {
        cout << "Stack is empty." << endl;
    } else {
        cout << "Top element is: " << top->data << endl;
    }
}

Stack* display(Stack* top) {
    if (top == NULL) {
        cout << "Stack is empty." << endl;
    } else {
        Stack* ptr = top;
        cout << "Stack elements are: " << endl;
        while (ptr != NULL) {
            cout << ptr->data << endl;
            ptr = ptr->next;
        }
    }
    return top;
}

int main() {
    int option;

    do {
        cout << "Main Menu" << endl;
        cout << "1. Push" << endl;
        cout << "2. Pop" << endl;
        cout << "3. Peep Element" << endl;
        cout << "4. Display" << endl;
        cout << "5. Exit" << endl;
        cout << "Enter your choice: ";
        cin >> option;

        switch (option) {
            case 1:
                top = push(top);
                break;
            case 2:
                top = pop(top);
                break;
            case 3:
                peep(top);
                break;
            case 4:
                display(top);
                break;
            case 5:
                cout << "Exiting program." << endl;
                break;
            default:
                cout << "Invalid choice. Try again." << endl;
        }
    } while (option != 5);

    return 0;
}