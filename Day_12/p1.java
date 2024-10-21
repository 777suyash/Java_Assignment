import java.util.Scanner;

class p1{
    public static void main(String args[]){

        Scanner sc =new Scanner(System.in);

        System.out.print("Enter first number");
        int a = sc.nextInt();

        System.out.print("Enter second number");
        int b = sc.nextInt();

        int add=a+b;
        int sub;
            if(a<b){
                sub = b-a;
            }
            else{
                sub =a-b;
            }
        System.out.println(add);
        System.out.println(sub);
    }
}