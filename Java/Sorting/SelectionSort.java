import java.util.*;
public class SelectionSort {
    static void selectionsort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int smallest = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j] < arr[smallest]){
                    smallest = j;
                }
            }
            //to put min at correct position
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
    }

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
        System.out.print("Enter elements of array:");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt() ;
        }
        selectionsort(arr);
        System.out.println("Sorted Array:");
        printArray(arr);
    }
    
}
