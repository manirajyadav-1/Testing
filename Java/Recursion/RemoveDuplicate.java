class RemoveDuplicate {
    static boolean arr[] = new boolean[26];

    static void removedup(String str,int idx, String newStr){
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);
        if(arr[currChar - '0'] == true){
            removedup(str, idx+1, newStr);
        }
        else{
            newStr += currChar;
            arr[currChar - '0'] = true; //updating
            removedup(str, idx+1, newStr);
        }
    }
    public static void main(String[] args) {
        String str = "aabcde";
        removedup(str, 0, "");
    }
    
}
