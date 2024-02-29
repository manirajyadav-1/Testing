public class MaxSubArray {
    public static int Max(int arr[]){
        int max = Integer.MIN_VALUE;
        int curr = 0;
        for(int i=0;i<arr.length;i++){
            curr = curr + arr[i];
            if(curr > max){
                max = curr;
            }
            if(curr < 0){
                curr = 0;
            }
        }
        return max;
    }
    public static void main(String args[]){
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(Max(arr));
    }

}
