import java.util.*;

class Function {
    static void Armstrong(int n){
        int original = n;
        int sum = 0, rem;
        while(n>0){
            rem = n%10;
            sum = sum + (rem*rem*rem);
            n = n/10;
        }
        if(sum==original){
            System.out.println("Armstrong No.");
        }else{
            System.out.println("Not Armstrong No.");
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Armstrong(n);
    }
}
