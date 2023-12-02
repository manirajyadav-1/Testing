import java.util.*;
public class CalcPower {
    static int myPow(int x,int n){
        if(n==0){
            return 1;
        }
        int Nm1 = myPow(x, n-1);
        int XN = x*Nm1;
        return XN;
    }
    public static void main(String args[]){
        int x = myPow(2,2);
        System.out.println(x);
    }
}
