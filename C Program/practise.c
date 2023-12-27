#include<stdio.h>

int main()
 {
    float a, b, d;
    int c, i=0;

    while(i<10)
    {
        printf("\n Enter the first number : \n");
        scanf("%f", &a);
        printf("Enter the second number : \n");
        scanf("%f", &b);
        printf("Chose 1 for ('+'), 2 for ('-'), 3 for ('/'), 4 for ('*'), 0 for ('Exit'): ");
        scanf("%d", &c);

        switch (c)
        {
            case 1:
                d = a + b;
                printf("%.2f", d);
                break;
                
             case 2:
                d = a - b;
                printf("%.2f", d);
                break;
                
             case 3:
                d = a / b;
                printf("%.2f", d);
                break;
                
             case 4:
                d = a * b;
                printf("%.2f", d);
                break;
                
            case 0:
                printf("You put '0' for exit");
                i=10;
                break;                
        }
    }

   
}