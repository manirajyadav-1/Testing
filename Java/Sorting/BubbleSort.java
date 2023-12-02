import java.util.*;

class BubbleSort{ //time complexity O(n^2)
    static void bubblesort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j] > arr[j+1]){
                int temp = arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
        }
    }
    static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //size of array
        System.out.print("Enter size of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];

        //array elements
        System.out.print("Enter array elements:");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        bubblesort(arr);
        System.out.println("Sorted Elements are ");
        printArray(arr);

    }
}