public class BuySell {
    public static void main(String[] args){
        int arr[] = {7,1,5,3,6,4};
        System.out.println(Stock(arr));;
    }

    public static int Stock(int arr[]){
        int minsofar = arr[0];
        int maxProfit = 0;

        for(int i=0;i<arr.length;i++){
            minsofar = Math.min(arr[i], minsofar);
            int profit = arr[i] - minsofar;
            maxProfit = Math.max(maxProfit,profit);
        }
        return maxProfit;
    }
}
