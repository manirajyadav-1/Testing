#include<stdio.h>
#include<stdlib.h>
void create();
void display();
void countNodes();

struct linked_list{
    int data;
    struct linked_list *next;
};
typedef struct linked_list node;
node *head=NULL, *temp=NULL;

int main(){
    int choice;
    while(1){
        printf("\n    MENU     \n");
        printf("1.Create\n");
        printf("2.Display\n");
        printf("3.Count number of nodes\n");
        printf("4.Exit\n");
        printf("\n..................\n");
        printf("ENter your choice:");
        scanf("%d",&choice);

        switch(choice){
            case 1: create(); break;
            case 2: display(); break;
            case 3: countNodes(); break;
            case 4: exit(0); break;
            default: printf("\nWrong Choice\n"); break;
        }

    }
}

void create()
{
    node *ptr;
    int item;
    ptr = (node*) malloc(sizeof(node));
    if(ptr == NULL){
        printf("\n OVERFLOW: Unable to allocate memory.\n");
        exit(0);
    }
    printf("\nEnter data value:\n");
    scanf("%d",&item);
    ptr -> data = item;
    ptr -> next = NULL;

    if(head == NULL){
        head = ptr;
        temp = head;
    }
    else{
        temp -> next = ptr;
        temp = temp -> next;
    }
    printf("\nNode inserted\n");
}

void display()
{
    node *ptr;
    if(head == NULL){
        printf("\nList is empty.\n");
        return;
    }
    else{
        ptr = head;
        printf("\n Printing List.......\n");
        if(ptr -> next==NULL){
            printf("%d",ptr -> data);
            return;
        }
        while(ptr!=NULL){
            printf("%d......>",ptr->data);
            if(ptr->next->next==NULL){
                printf("%d",ptr->next->data);
                return;
            }
            ptr=ptr->next;
        }
    }
}

void countNodes(){
    int count = 0;
    node *ptr;
    ptr = head;
    while(ptr!=NULL){
        count++;
        ptr = ptr->next;
    }
    printf("\n Total number of nodes = %d\n",count);
}