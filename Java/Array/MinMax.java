import java.util.*;

class MinMax{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //array size
        System.out.print("Enter size of an array:");
        int n = sc.nextInt();
        int number[] = new int[n];

        //array elements
        System.out.print("Enter array elements:");
        for(int i=0;i<n;i++){
            number[i] = sc.nextInt();
        }

         //initializing to zero
         int min,max;
         min=max=number[0];

         for(int i=0;i<n;i++){//comparing
            if(number[i]<min){
                min = number[i];
            }
            if(number[i]>max){
                max = number[i];
            }
         }
         System.out.println("Minimum Value:" + min);
         System.out.println("Maximum Value:" + max);


    }
}