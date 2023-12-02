import java.util.*;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row:");
        int row = sc.nextInt();
        System.out.println("Enter column:");
        int col = sc.nextInt();

        int number[][] = new int[row][col];
 

        //for row and column here we use nested for loop
        System.out.printf("Enter %d by %d matrix:\n",row,col);
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                number[i][j] = sc.nextInt();
            }
        }


        //printing the given array
        System.out.println("Given Matrix:");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(number[i][j]+" ");
            }
            System.out.println();
        }

    }
}