#include<stdio.h>

struct Employee{
    int id;
    char name[10];
    int age;
    int reporting_to;
}e1;

int main(){
    printf("%u\n",&e1.id);
    printf("%u\n",&e1.name);
    printf("%u\n",&e1.age);
    printf("%u\n",&e1.reporting_to);
    return 0;
}