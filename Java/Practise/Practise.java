import java.util.*;

public class Practise{
    // static int Power(int a,int b){
    //     if(b==0){
    //         return 1;
    //     }
    //     if(a==0){
    //         return 0;
    //     }
    //     if(b%2==0){
    //         return Power(a,b/2) * Power(a, b/2);
    //     }
    //     else{
    //         return Power(a,b/2) * Power(a, b/2) * a;
    //     }
    // }

    static int Power(int a,int b){
        if(b==0){
            return 1;
        }
        // int bM1 = Power(a,b-1);
        // int ab = a*bM1;
        return a*Power(a,b-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base: ");
        int a = sc.nextInt();
        System.out.print("Enter power: ");
        int b = sc.nextInt();
        System.out.println(Power(a, b));
    }
}