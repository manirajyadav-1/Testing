import java.util.*;

class Height{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numerator:");
        int a = sc.nextInt();
        System.out.print("Enter denominator:");
        int b = sc.nextInt();
        int height = Math.max(a, b);
        System.out.println(height);
    }
}