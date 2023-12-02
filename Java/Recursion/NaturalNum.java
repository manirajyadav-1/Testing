class NaturalNum{
    static void naturalnum(int n, int i, int sum){
        if(i == n){
            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i;
        naturalnum(n, i+1, sum);
    }
    public static void main(String[] args) {
        naturalnum(5, 1, 0);
    }
}