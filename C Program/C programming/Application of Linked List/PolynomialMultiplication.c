//Polynomial Multiplication
#include<stdio.h>
#include<stdlib.h>

struct node{
    int coeff;
    int exp;
    struct node* next;
};

struct node* insert(struct node* head,int coeff,int exp){
    struct node* temp = NULL;
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
    struct node* temp = head;
    if(head == NULL){
        printf("No Polynomials");
    }
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

void mulPoly(struct node* head1,struct node* head2){
    struct node* ptr1 = head1;
    struct node* ptr2 = head2;
    struct node* head3 = NULL;

    if(head1==NULL || head2==NULL){
        printf("Zero Polynomial");
    }
    while(ptr1!=NULL){
        while(ptr2!=NULL){
            head3 = insert(head3,ptr1->coeff*ptr2->coeff,ptr1->exp+ptr2->exp);
            ptr2 = ptr2->next;
        }
        ptr1 = ptr1->next;
        ptr2 = head2;
    }
    print(head3);
}

int main(){
    struct node* head1 = NULL;
    struct node* head2 = NULL;

    printf("Enter first Polynomial\n");
    head1 = create(head1);
    printf("Enter second polynomial\n");
    head2 = create(head2);

    mulPoly(head1,head2);
    return 0;
}