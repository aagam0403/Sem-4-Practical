#include <iostream>
using namespace std;
#define MAX 5

class Stack {
    int arr[MAX];
    int top;

public:
    Stack() {
        top = -1;
    }

    void push(int value) {
        if (top == MAX - 1) {
            cout << "Stack overflow!" << endl;
            return;
        }
        arr[++top] = value;
    }

    int pop() {
        if (top == -1) {
            cout << "Stack underflow!" << endl;
            return -1;
        }
        return arr[top--];
    }

    int findMax() {
        if (top == -1) {
            cout << "Stack is empty!" << endl;
            return -1;
        }
        int maxVal = arr[0];
        for (int i = 1; i <= top; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

    void display() {
        if (top == -1) {
            cout << "Stack is empty!" << endl;
            return;
        }
        for (int i = top; i >= 0; i--) {
            cout << arr[i] << " ";
        }
        cout << endl;
    }
};

int main() {
    Stack s;
    int choice, value;

    do {
        cout << "\n1. Push\n2. Pop\n3. Find Max\n4. Display\n5. Exit\nEnter your choice: ";
        cin >> choice;
        switch (choice) {
            case 1:
                cout << "Enter value to push: ";
                cin >> value;
                s.push(value);
                break;
            case 2:
                value = s.pop();
                if (value != -1) {
                    cout << "Popped value: " << value << endl;
                }
                break;
            case 3:
                value = s.findMax();
                if (value != -1) {
                    cout << "Maximum value: " << value << endl;
                }
                break;
            case 4:
                s.display();
                break;
            case 5:
                cout << "Exiting..." << endl;
                break;
            default:
                cout << "Invalid choice! Try again." << endl;
        }
    } while (choice != 5);

    return 0;
}
