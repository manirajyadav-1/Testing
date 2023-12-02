import java.util.Scanner;

public class UpdateBit {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int oper = sc.nextInt();
    int n = 5; //0101
    int pos = 1;

    int bitMask = 1 << pos;

    if(oper == 1){
        //set
        int newNumber = bitMask | n;
        System.out.println(newNumber);
    }else{
        //clear
        int newbitMask = ~(bitMask);
        int newNumber = newbitMask & n;
        System.out.println(newNumber);
    }

   } 
}
