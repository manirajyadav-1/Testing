import java.util.HashSet;

class Subsequence2 {
    static void printsubsequence(String str, int index, String newStr,HashSet<String> set){
        if(index==str.length()){
            if(set.contains(newStr)){
                return;
            }
            else{
                System.out.println(newStr);
                set.add(newStr);
                return;
            }
        }
        char currChar = str.charAt(index);
        printsubsequence(str, index+1, newStr+currChar, set);

        printsubsequence(str, index+1, newStr, set);

    }
    public static void main(String[] args) {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        printsubsequence(str, 0, "",set);
    }
    
}
