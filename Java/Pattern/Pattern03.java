import java.util.*;
class B{
    static void Pattern03(int n){
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
public static void main(String[] args){
    int n=5;
    Pattern03(n);
}
}