import java.util.Arrays;
import java.util.HashMap;
class TwoSum{
    public static int[] add(int[] arr,int target){
        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            int req_num = target-arr[i];
            if(hm.containsKey(req_num)){
                return new int[] {hm.get(req_num),i};
            }
            hm.put(arr[i], i);
        }
        return new int[] {};
    }
    public static void main(String[] args){
        int arr[] = {2,4,10,5,7,4};
        int target = 9;
        System.out.println(Arrays.toString(add(arr,target)));
    }
}