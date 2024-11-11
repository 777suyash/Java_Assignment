import java.util.Scanner;

class p2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num1 : ");
        int num1 = sc.nextInt();
        System.out.println("Enter num2 : ");
        int num2 = sc.nextInt();
        
        for(int i = num1; i<=num2; i++){
            int a = 1;
            for(int j=1; j<=i; j++){
                a *=j;
            }
            System.out.println("Factorial of "+i+" is "+a);
        }
    }
}