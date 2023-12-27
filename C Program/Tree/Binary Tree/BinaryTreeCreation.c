#include<stdio.h>
#include<stdlib.h>

struct node{
    int data;
    struct node *left;
    struct node *right;
};

struct node *create();
void inorder(struct node *root);
void preorder(struct node *root);
void postorder(struct node *root);

int main(){
    struct node *root;
    root = create();
    printf("Traversel of binary tree\n");
    printf("Inorder Traversal\n");
    inorder(root);
    printf("\nPreorder Traversal\n");
    preorder(root);
    printf("\nPostorder Traversal\n");
    postorder(root);
}

struct node *create(){
    struct node *newnode = (struct node*) malloc(sizeof(struct node));
    printf("\nPress 0 to exit:\n");
    printf("Press 1 for newnode:\n");
    printf("Enter choice:");
    int choice;
    scanf("%d",&choice);
    if(choice == 0){
        return NULL;
    }
    else if(choice == 1){
        printf("Enter a data:");
        int x;
        scanf("%d",&x);
        newnode->data = x;
        printf("Enter the left child of %d:",x);
        newnode->left = create();
        printf("Enter the right child of %d",x);
        newnode->right = create();
        return newnode;
    }
    return NULL;
}

void inorder(struct node *root){
    if(root == NULL){
        return;
    }
    inorder(root->left);
    printf("%d ",root->data);
    inorder(root->right);
}

void preorder(struct node *root){
    if(root == NULL){
        return;
    }
    printf("%d ",root->data);
    preorder(root->left);
    preorder(root->right);
}

void postorder(struct node *root){
    if(root == NULL){
        return;
    }
    postorder(root->left);
    postorder(root->right);
    printf("%d ",root->data);
}