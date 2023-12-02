import java.util.Arrays;
class TwoSum{
    public static int[] add(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j] == target){
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {};
    }
    public static void main(String[] args){
        int arr[] = {2,4,10,5,7,4};
        int target = 9;
        System.out.println(Arrays.toString(add(arr,target)));
    }
}