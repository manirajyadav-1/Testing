// // import java.util.*;
// class UpperLower {
//     public static void main(String[] args) {
//         String str = "ManiRaj";
//         StringBuffer newStr = new StringBuffer(str);

//         for (int i = 0; i < str.length(); i++) {
//             if (Character.isLowerCase(str.charAt(i))) {
//                 newStr.setCharAt(i, Character.toUpperCase(str.charAt(i)));
//             } else if(Character.isUpperCase(str.charAt(i))){
//                 newStr.setCharAt(i, Character.toLowerCase(str.charAt(i)));
//             }
//         }
//         System.out.println(newStr);
//     }
// }

public class UpperLower {
    public static void main(String[] args)
    {
        StringBuffer sb = new StringBuffer();
        sb.append("Hello");
        sb.append(" ");
        sb.append("world ");
        sb.insert(12,"Mani");
        // String message = sb.toString();
        System.out.println(sb);
    }
}