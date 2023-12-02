import java.util.Scanner;

public class FibonacciSeries {
    static void fibonacci(int a, int b, int n){
        if(n==0){
            return;
        }
        int c = a + b;
        System.out.println(c);
        fibonacci(b, c, n-1);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int a = 0, b = 1;
        System.out.println(a);
        System.out.println(b);
        fibonacci(a, b, n-2);
    }
}