import java.util.Scanner;

class p4{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int a = sc.nextInt();
		int b=1;
		for(int i=1; i<=a; i++){
			b=b*i;
		}
		System.out.print("The Factorial of "+a+" is "+b );
	}
}