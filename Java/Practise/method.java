import java.util.*;

class Method {
    public static int add(int a, int b){
        return a+b;
    }
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int c = add(a,b);
        System.out.println(c); 
    }
}