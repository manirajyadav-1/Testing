import java.util.*;
class PrintNum02 {
    static void printNum02(int n, String arr[]){
        if(n == 0){
            return;
        }
        int a=n%10;
        n=n/10;
        printNum02(n,arr);
        System.out.print(arr[a] + " ");
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String arr[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
        printNum02(n,arr);
    }
}
