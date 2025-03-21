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

int search(int item, node *tree)
{
    while (tree != NULL)
    {
        if (tree->data == item)
            return 1;
        else if (item < tree->data)
            tree = tree->left;
        else
            tree = tree->right;
    }
    return 0;
}

int main()
{
    int choice, item, flag = 0;
    cout << "1. Insert\n2. Search\n3. Exit\n";

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
            cout << "Enter Value to Search: ";
            cin >> item;
            flag = search(item, tree);
            if (flag == 0)
                cout << "Element Not Found" << endl;
            else
                cout << "Element Found" << endl;
            break;
        case 3:
            exit(0);
        default:
            cout << "Enter Correct Choice!" << endl;
        }
    } while (choice != 3);

    return 0;
}
