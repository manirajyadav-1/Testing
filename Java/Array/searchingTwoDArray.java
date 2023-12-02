import java.util.*;

class LinearSearch{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row and column:");
        int row = sc.nextInt();
        int col = sc.nextInt();
        int number[][] = new int[row][col];

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                number[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter elements to be searched:");
        int x = sc.nextInt();

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(number[i][j] == x){
                    System.out.println("x if found at:("+ i +","+ j +")");
                    break;
                }
            }
        }
    }
}

