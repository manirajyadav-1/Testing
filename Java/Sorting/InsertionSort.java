/*The array is virtually split into a sorted and an unsorted part. Values from the unsorted part are picked and placed at the correct position in the sorted part. */
import java.util.*;

public class InsertionSort {
    static void insertionsort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int temp = arr[i];
            int j = i-1; //for storing sorted elements

            while(j>=0 && arr[j]>temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
    }

    //printing array
    static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];

        //array elements
        System.out.print("Enter array elements:");
        for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
        }
        insertionsort(arr);
        System.out.println("Sorted elements are ");
        printArray(arr);
    }
    
}
