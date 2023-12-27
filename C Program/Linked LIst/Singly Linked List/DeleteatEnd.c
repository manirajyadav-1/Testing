#include<stdio.h>
#include<stdlib.h>
                                     
struct node{
    int data;
    struct node *next;
};

struct node *deleteatend(struct node *head) {
    struct node *ptr = head;
    struct node *q = NULL;
    
    while (ptr->next != NULL) {
        q = ptr;
        ptr = ptr->next;
    }
    if (q == NULL) {
        head = NULL;
    } else {
        q->next = NULL;
    }
    free(ptr);
    return head;
}


void printlinkedlist(struct node *head){
    if(head == NULL){
        printf("Linked List is empty");
    }
    struct node *ptr = NULL;
    ptr = head;
    while(ptr != NULL){
        printf("%d\n",ptr->data);
        ptr=ptr->next;
    }
}

int main(){
    struct node *head = (struct node*) malloc(sizeof(struct node));
    struct node *second = (struct node*) malloc(sizeof(struct node));
    struct node *third = (struct node*) malloc(sizeof(struct node));

    head->data = 50;
    head->next = second;

    second->data = 60;
    second->next = third;

    third->data = 70;
    third->next = NULL;

    head=deleteatend(head);
    printlinkedlist(head);
    return 0;
}
