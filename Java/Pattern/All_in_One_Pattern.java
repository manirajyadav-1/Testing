import java.util.*;
class AllinOnePattern {
    static void Pattern01(int n){ //Left triangle star pattern
            for(int i=0;i<n;i++){
                for(int j=0;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }


        static void Pattern02(int n){ //Right pascal star pattern
            for(int i=0;i<n;i++){
                for(int j=0;j<i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
            for(int i=n;i>0;i--){
                for(int j=0;j<i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        static void Pattern03(int n){ //Left triangle number pattern
            for(int i=1;i<=n;i++){
                for(int j=0;j<i;j++){
                    System.out.print(i);
                }
                System.out.println();
            }
        }

        static void Pattern04(int n){ //Square Star Pattern
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        static void Pattern05(int n){ //Hollow Square Star Pattern
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n;j++){
                    if(i==1 || i==n || j==1 || j==n){
                        System.out.print("*");
                    }else{
                    System.out.print(" ");
                }
                }
                System.out.println();
            }
        }

        static void Pattern06(int n){ //Right triangle star pattern
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n-i;j++){
                    System.out.print(" ");
                }
                for(int k=1;k<=i;k++){
                System.out.print("*");
                }
                System.out.println();
            }
        }

        static void Pattern07(int n){ //Right down triangle star pattern
            for(int i=n;i>=1;i--){
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        static void Pattern08(int n){ //Left down triangle star pattern
            for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){
                    System.out.print(" ");                
                }
                for(int k=n;k>=i;k--){
                System.out.print("*");
                }
                System.out.println();
            }
        }

        static void Pattern09(int n){ //Right hollow triangle star pattern
            for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){
                    if(j==1 || i==n || j==i){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }

        static void Pattern10(int n){ // Pyramid Star Pattern
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n-i;j++){
                    System.out.print(" ");
                }
                for(int k=1;k<=2*i-1;k++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        static void Pattern11(int n){ //Diamond Star Pattern
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n-i;j++){
                    System.out.print(" ");
                }
                for(int k=1;k<=2*i-1;k++){
                    System.out.print("*");
                }
                System.out.println();
            }
            for(int i=n;i>=1;i--){
                for(int j=1;j<=n-i;j++){
                    System.out.print(" ");
                }
                for(int k=1;k<=2*i-1;k++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        static void Pattern12(int n){ //Left Parallelogram Star Pattern
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n-i;j++){
                    System.out.print(" ");
                }
                for(int k=1;k<=n;k++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        static void Pattern13(int n){ //Right parallelogram star pattern
            for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){
                    System.out.print(" ");
                }
                for(int k=1;k<=n;k++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        static void Pattern14(int n){ //Butterfly Pattern
            //upper half
            for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                for(int j=1;j<=2*(n-i);j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println();
            } 
            //lower half 
            for(int i=n;i>=1;i--){
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                for(int j=1;j<=2*(n-i);j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }   
        }

        static void Pattern15(int n){ //Left triangle number pattern
            for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){
                    System.out.print(j);
                }
                System.out.println();
            }
        }

        static void Pattern16(int n){ //Left Down Number Triangle Pattern
            for(int i=n;i>=1;i--){
                for(int j=1;j<=i;j++){
                    System.out.print(j);
                }
                System.out.println();
            }
        }

        static void Pattern17(int n){  //Left Number triangle Pattern
            int number = 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(number+ " ");
                number++;
            }
            System.out.println();
        }
    }

    static void Pattern18(int n){ //Left Binary Number Tringle Pattern
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                System.out.print(1+ " ");
                }
                else{
                    System.out.print(0+ " ");
                }
            }
            System.out.println();
        }
    }

    static void Pattern19(int n){ //Number Pyramid Pattern
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
            System.out.print(i+ " ");
            }
            System.out.println();
        }
    }

    static void Pattern20(int n){     //Number Pyramid Pattern
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //first part
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            //second part
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Pattern number:");
    int Pattern_num = sc.nextInt();
    System.out.print("Enter total no. of row:");
    int n = sc.nextInt();
    switch(Pattern_num){
        case 1:
        Pattern01(n);break;
        case 2:
        Pattern02(n);break;
        case 3:
        Pattern03(n);break;
        case 4:
        Pattern04(n);break;
        case 5:
        Pattern05(n);break;
        case 6:
        Pattern06(n);break;
        case 7:
        Pattern07(n);break;
        case 8:
        Pattern08(n);break;
        case 9:
        Pattern09(n);break;
        case 10:
        Pattern10(n);break;
        case 11:
        Pattern11(n);break;
        case 12:
        Pattern12(n);break;
        case 13:
        Pattern13(n);break;
        case 14:
        Pattern14(n);break;
        case 15:
        Pattern15(n);break;
        case 16:
        Pattern16(n);break;
        case 17:
        Pattern17(n);break;
        case 18:
        Pattern18(n);break;
        case 19:
        Pattern19(n);break;
        case 20:
        Pattern20(n);break;
    }
}
}
