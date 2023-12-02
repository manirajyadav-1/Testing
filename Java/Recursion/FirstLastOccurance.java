import javax.print.event.PrintEvent;

public class FirstLastOccurance {
    static int first = -1;
    static int last = -1;
    static void printOccurance(String str, int idx, char element){
        if(idx == str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currchar = str.charAt(idx);
        if(currchar == element){
            if(first == -1){
                first = idx;
            }
            else{
                last = idx;
            }
        }
        printOccurance(str, idx+1, element);
    }
    public static void main(String[] args) {
        String str = "computerscience";
        printOccurance(str, 0, 'c');
    }
}
