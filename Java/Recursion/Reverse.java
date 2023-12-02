import java.util.*;
public class Reverse {
    static void printRev(String str, int idx){
        if(idx == 0){
            System.out.println(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        printRev(str, idx-1);
    }
    public static void main(String[] args) {
        System.out.print("Enter a string:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        printRev(str, str.length());
    }
}
