class Recursion{
    static void printSebsequence(String str,int index, String newString){
        if(index==str.length()){
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(index);

        printSebsequence(str, index+1, newString+currChar); // to be

        printSebsequence(str, index+1, newString); //not to be
    }
    public static void main(String[] args) {
        String str = "abc";
        printSebsequence(str, 0, "");
    }
}