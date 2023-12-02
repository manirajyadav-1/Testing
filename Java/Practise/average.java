import java.util.*;

class Average {
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a:");
    int a = sc.nextInt();
    System.out.println("Enter b:");
    int b = sc.nextInt();
    System.out.println("Enter c:");
    int c = sc.nextInt();
    float avg = (a+b+c)/3F;
    System.out.println(avg);
}
}