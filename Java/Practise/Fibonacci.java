import java.util.*;

class Fibonacci{
    static void fib(int a,int b,int n){
        for(int i=0;i<n;i++){
        int c = a+b;
        System.out.print(c + " ");
        a=b;
        b=c;
    }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int a = 0,b = 1; 
        System.out.print(a + " " + b+ " ");
        fib(a, b, n-2);
    }
}