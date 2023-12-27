#include<stdio.h>
#include<stdlib.h>

struct node{
    int coeff;
    int exp;
    struct node* next;
};

struct node* insert(struct node* head,int coeff,int exp){
    struct node* temp;
    struct node* newnode = malloc(sizeof(struct node));
    newnode->coeff = coeff;
    newnode->exp = exp;
    newnode->next = NULL; 

    if(head==NULL || exp > head->exp){
        newnode->next = head;
        head = newnode;
    }
    else{
        temp = head;
        while(temp->next!=NULL && temp->next->exp >= exp){
            temp = temp->next;
        }
        newnode->next = temp->next;
        temp->next = newnode;
    }
    return head;
}

struct node* create(struct node* head){
    int n;
    int coeff,exp;

    printf("Enter the number of terms: ");
    scanf("%d",&n);

    for(int i=0;i<n;i++){
        printf("Enter the coefficient for the term %d: ",i+1);
        scanf("%d",&coeff);

        printf("Enter the exponent for the term %d: ",i+1);
        scanf("%d",&exp);

        head = insert(head,coeff,exp);
    }
    return head;
}

void print(struct node* head){
    if(head == NULL){
        printf("NO Polynomial.");
    }
    else{
        struct node* temp = head;
        while(temp!=NULL){
            printf("%dx^%d",temp->coeff,temp->exp);
            temp = temp->next;
            if(temp!=NULL){
                printf(" + ");
            }
            else{
                printf("\n");
            }
        }
    }
}

int main(){
    struct node* head = NULL;
    printf("Enter the polynomial\n");
    head = create(head);
    print(head);
    return 0;
}