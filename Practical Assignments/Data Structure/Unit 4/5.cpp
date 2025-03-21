#include<iostream>
using namespace std;

class node
{
    public:
    int data;
    node *left;
    node *right;
};

node *tree = NULL;

node *insert(node *tree)
{
    int val;
    cout << "Enter Value (-1 to stop): ";
    cin >> val;
    while (val != -1)
    {
        node *ptr, *parentptr, *nodeptr;
        ptr = new node();
        ptr->data = val;
        ptr->left = ptr->right = NULL;

        if (tree == NULL)
        {
            tree = ptr;
        }
        else
        {
            parentptr = NULL;
            nodeptr = tree;
            while (nodeptr != NULL)
            {
                parentptr = nodeptr;
                if (val < nodeptr->data)
                    nodeptr = nodeptr->left;
                else
                    nodeptr = nodeptr->right;
            }
            if (val < parentptr->data)
                parentptr->left = ptr;
            else
                parentptr->right = ptr;
        }
        cout << "Enter Value (-1 to stop): ";
        cin >> val;
    }
    return tree;
}

int sum(node *tree)
{
    if (tree == NULL)
        return 0;
    else
        return tree->data + sum(tree->left) + sum(tree->right);
}

int main()
{
    int choice, s;
    cout << "1. Insert\n2. Sum of all elements\n3. Exit\n";

    do
    {
        cout << "Enter Choice: ";
        cin >> choice;

        switch (choice)
        {
        case 1:
            tree = insert(tree);
            break;
        case 2:
            s = sum(tree);
            cout << "Sum of all elements: " << s << endl;
            break;
        case 3:
            exit(0);
        default:
            cout << "Enter Correct Choice!" << endl;
        }
    } while (choice != 3);

    return 0;
}
