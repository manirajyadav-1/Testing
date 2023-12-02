class TilesPlacement{
    static int printPlacements(int n, int m){
        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }

        //vertical placements
        int vertPlacements = printPlacements(n-m, m);

        //horizontal placements
        int horizPlacements = printPlacements(n-1, m);

        return horizPlacements + vertPlacements;
    }
    public static void main(String[] args) {
        int n=4,m=2;
        System.out.println(printPlacements(n, m));
    }
}