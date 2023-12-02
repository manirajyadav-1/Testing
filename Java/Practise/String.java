import java.util.*;

class Array{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String name[] = new String[n];

        for(int i=0;i<n;i++){
            name[i] = sc.next();
        }

        //printing of array
        for(int i=0;i<name.length;i++){
            System.out.print(name[i]+" ");
        }
    }
}