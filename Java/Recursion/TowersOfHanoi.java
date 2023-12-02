import java.util.*;

class TowersOfHanoi{
    static void hanoitower(int n, String src, String aux, String dest){
        if(n==0){
            return;
        }
        hanoitower(n-1, src, dest, aux);
        System.out.println("Transfer disk "+ n + " from " + src + " to " + dest);
        hanoitower(n-1, aux, src, dest);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        hanoitower(n, "S", "A", "D");
    }
}