public class FactorialUsingRecursion {
    static int fact(int n){
        if(n == 1 || n == 0){
            return 1;
        }
        int factNm1 = fact(n-1);
        int factN = n * factNm1;
        return factN;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fact(n));

    }    
}
