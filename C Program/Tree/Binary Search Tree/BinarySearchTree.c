#include <stdio.h>
#include <stdlib.h>

struct linked_list
{  
    int data;  
    struct linked_list *left, *right;  
};
typedef struct linked_list node;

node *create(int item)
{
    node *temp;  
    temp = (node *)malloc(sizeof(node));
    temp->data = item;
    temp->left = temp->right = NULL;
    return temp;
}

node *insert(node *root, int item)   
{  
    if (root == NULL)  
        return create(item); 
    if (item < root->data)  
        root->left = insert(root->left, item);  
    else  
        root->right = insert(root->right, item);  
    return root;  
}  

void inorder(node *root) 
{
  if (root == NULL) 
    return;
  inorder(root->left);
  printf("%d ", root->data);
  inorder(root->right);
}

int main()
{
    node *root = NULL;  
    root = insert(root, 35);  
    root = insert(root, 10);  
    root = insert(root, 45);  
    root = insert(root, 6);  
    root = insert(root, 3);  
    printf("Inorder traversal of the binary search tree: \n");  
    inorder(root);  
}