import java.util.*;

class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fn = sc.nextLine();
        String ln = sc.nextLine();
        String fullname = fn +" "+ ln;
        System.out.println(fullname);
        System.out.println("Length of string:" + fullname.length());
        System.out.println(fn.equals(ln));
        String name = "Mani raj";
        System.out.println(name.substring(1,7));
        
    }
}