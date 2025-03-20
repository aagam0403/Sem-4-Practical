#include <iostream>
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
    for (int i = 0; i < 15; i++)
    {
        cout << "\nEnter value: ";
        cin >> val;
        node *ptr, *nodeptr, *parentptr;
        ptr = new node();
        ptr->data = val;

        if (tree == NULL)
        {
            tree = ptr;
            tree->left = NULL;
            tree->right = NULL;
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
    }
    return tree;
}

void preorder(node *tree)
{
    if (tree != NULL)
    {
        cout << tree->data << " ";
        preorder(tree->left);
        preorder(tree->right);
    }
}

int main()
{
    cout << "Insert 15 values into the tree:" << endl;
    tree = insert(tree);

    cout << "\nPreorder Traversal:\n";
    preorder(tree);
    cout << endl;

    return 0;
}
