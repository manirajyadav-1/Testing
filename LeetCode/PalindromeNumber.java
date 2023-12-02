import java.util.*;
public class PalindromeNumber {

    public static boolean palindrome(int n){
        if(n<0){
            return false;
        }
        long temp = n;
        long reversed = 0;
        while(temp!=0){
            int rem = (int) (temp%10);
            reversed = (reversed*10) + rem;
            temp /= 10;
        }
        return (reversed == n);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println(palindrome(n));
    }
}
