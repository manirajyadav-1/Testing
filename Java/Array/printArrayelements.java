import java.util.*;

class Arrays{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array:");
        int size = sc.nextInt();//size of array
        int number[] = new int[size];
         
        //elements of array
        System.out.print("Enter elements of array:");
        for(int i=0;i<size;i++){
            number[i] = sc.nextInt();
        }

        //printing of array
        System.out.println("Array elemets are:");
        for(int i=0;i<number.length;i++){
            System.out.println(number[i]+" ");
        }
    }
}