import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ChocolateDistribution {
    public static int findMinDiff(ArrayList<Integer> arr, int n, int m){
        Collections.sort(arr);
        int min = Integer.MAX_VALUE;

        for(int i=0;i<n-m+1;i++){
            int j = i+m-1;;
            if(arr.get(j) - arr.get(i) < min){
                min = arr.get(j) - arr.get(i);
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int arr[] = {7, 3, 2, 4, 9, 12, 56};
        int N = arr.length;
        int M = 3;

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int value : arr) {
            arrayList.add(value);
        }
        System.out.println(findMinDiff(arrayList, N, M));
    } 
}
