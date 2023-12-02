import java.util.*;

class Circle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();
        double pi = 3.14;
        double circumference = 2*pi*radius;
        System.out.format("%.2f", circumference);
    }
}