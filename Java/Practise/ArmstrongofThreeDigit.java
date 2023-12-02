import java.util.*;
class ArmstrongofThreeDigit {
    static boolean Armstrong(int n){
        int original = n;
        int sum = 0,rem;
        while(n>0){
            rem = n%10;
            sum = sum + (rem*rem*rem);
            n = n/10;
        }
        return sum==original;
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n
        for(int i=100;i<1000;i++){
            if(Armstrong(i)){
                System.out.print(i+" ");
            }
        }
        
    }
}
