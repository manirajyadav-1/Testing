#include<stdio.h>

void Add(int a, int b){
    int c = a+b;
    printf("%d\n",c);
}

void Subtract(int a ,int b){
    int c = a-b;
    printf("%d ",c);
}

int main(){
    Add(4,5);
    Add(100,500);
    Subtract(9,4);
}