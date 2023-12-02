import java.util.*;

public class StackCF {
    public static void main(String[] args){
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        int loc = s.search(2);
        System.out.println(loc);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
