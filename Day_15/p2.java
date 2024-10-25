import java.util.Scanner;

class p2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first num");
        int num1 = sc.nextInt();
        System.out.println("Enetr second num");
        int num2 = sc.nextInt();

        if(num1<num2){
            System.out.println("The Minimum number amongst "+num1+" & "+num2+" is "+num1);
        }
        else{
            System.out.println("The Minimum number amongst "+num1+" & "+num2+" is "+num2);
        }
    }
}