import java.util.Scanner;

class p1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        for(int i = 1; i <= num / 2; i++) {
			if(num % i == 0)
				sum += i;
		}
        if(num > 0 && sum == num) {
			System.out.println("Perfect");
		} else {
			System.out.println("Not Perfect");	
		}
    }
}