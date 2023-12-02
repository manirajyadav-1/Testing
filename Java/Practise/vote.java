import java.util.*;

class Vote {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age of preson:");
        int n = sc.nextInt();
        if(n>18){
            System.out.println("Eligible to vote.");
        }
        else{
            System.out.println("Not Eligible.");
        }
    }
}
