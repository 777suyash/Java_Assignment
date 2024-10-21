
import java.util.Scanner;

class p4{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number");
        int a = sc.nextInt();

        System.err.print("Enter second number");
        int b = sc.nextInt();

        System.out.print("Enter the sign operator");
        char sign = sc.next().charAt(0);

        switch(sign){
            case '+' : System.out.println("Addition of "+a+" & "+b+" is "+(a+b));
            break;
            case '-' : if(a<b){
                            System.out.println("Substraction of "+a+ " & "+b+" is "+(b-a));
                        }
                        else{
                            System.out.println("Substraction of "+a+" & "+b+" is "+(a-b));
                        }
            break;
            case '/' : if(a<b){
                            System.out.println("division of "+a+" & "+b+" is "+(b/a));
                        }
                        else{
                            System.out.println("division of "+a+" & "+b+" is "+(a/b));
                        }
            break;
            case '*':System.out.println("multiplication of "+a+" & "+b+" is "+(a*b));
            break;
            default: System.out.println("Enter Valid Sign");
        }
    }
}