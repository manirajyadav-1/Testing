import java.util.*;

class Array{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //size
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int number[] = new int[n];

        //Elements
        System.out.println("ENter elements of array:");
        for(int i=0;i<n;i++){
            number[i] = sc.nextInt();
        }

        //elements to be searched
        System.out.println("Enter elements to be searched:");
        int x = sc.nextInt();

        for(int i=0;i<number.length;i++){
            if(number[i]==x){
            System.out.println("x is found at "+i);
            }
        }
    }
}