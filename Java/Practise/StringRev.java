import java.util.*;
public class StringRev {
    public static String strrev(String str1){
        String newstr = "";
        for(int i=str1.length()-1;i>=0;i--){
            newstr += str1.charAt(i);
        }
        return newstr;
    }
    public static void main(String[] agrs){
        String str1 = "Mani";
        System.out.println(strrev(str1));
    }
}
