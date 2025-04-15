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
        cout << "\n enter value:";
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
        cout << tree->data << endl;
        preorder(tree->left);
        preorder(tree->right);
    }
}

void inorder(node *tree)
{
    if (tree != NULL)
    {
        inorder(tree->left);
        cout << tree->data << endl;
        inorder(tree->right);
    }
}

void postorder(node *tree)
{
    if (tree != NULL)
    {
        postorder(tree->left);
        postorder(tree->right);
        cout << tree->data << endl;
    }
}

int main()
{
    int option, val;
    struct node *ptr;

    do
    {
        cout << "\n************* MAIN MENU ****************" << endl;
        cout << "\n1. Insert";
        cout << "\n2. Preorder";
        cout << "\n3. Inorder";
        cout << "\n4. Postorder";
        cout << "\n5. Exit";
        cout << "\n\n***************************************";
        cout << "\n\nEnter your option:";
        cin >> option;

        switch (option)
        {
        case 1:
            tree = insert(tree);
            break;
        case 2:
            cout << "\n Preorder \n";
            preorder(tree);
            break;
        case 3:
            cout << "\n Inorder \n";
            inorder(tree);
            break;
        case 4:
            cout << "\n Postorder:\n";
            postorder(tree);
            break;
        }
    } 
    while (option != 5);

    return 0;
}
