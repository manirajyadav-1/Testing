class S{
    static void Pattern20(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //first part
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            //second part
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 5;
        Pattern20(n);
    }
}