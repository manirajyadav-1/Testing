package Java;

public class PrintEvenWords{
    public static void main(String[] args){
        String input = "Sky is blue and vast";
        String output[] = input.split(" ");
        for(String str : output){
            if(str.length() % 2 == 0){
                System.out.println(str);
            }
        }
    }
}
