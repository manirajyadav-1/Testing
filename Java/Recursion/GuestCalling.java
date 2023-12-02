public class GuestCalling {
    static int printCall(int n){
        if(n<=0){
            return 1;
        }

        //single
        int singleCall = printCall(n-1);

        //pairs
        int pairCall = (n-1) * printCall(n-2);

        return singleCall + pairCall;
    }
    public static void main(String[] args) {
        int n = 2;
        System.out.println(printCall(n));
    }
}
