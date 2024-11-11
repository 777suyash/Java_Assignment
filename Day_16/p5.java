import java.util.Scanner;

class p5{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enetr first num : ");
        int num1 = sc.nextInt();
        System.out.println("Enetr second num : ");
        int num2 = sc.nextInt();
        System.out.println("Enetr third num : ");
        int num3 = sc.nextInt();

        if(num1<num2 && num1<num3){
            System.out.println( "The Minimum number amongst "+num1+" "+num2+" & "+num3+" is "+num1);
        }
        else if(num2<num1 && num2<num3){
            System.out.println( "The Minimum number amongst "+num1+" "+num2+" & "+num3+" is "+num2);
        }
        else{
            System.out.println( "The Minimum number amongst "+num1+" "+num2+" & "+num3+" is "+num3);
        }
    }
}