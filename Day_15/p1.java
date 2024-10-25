import java.util.Scanner;

class p1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Min of Series : ");
        int num1 = sc.nextInt();
        System.out.println("Enter Max of Series : ");
        int num2 = sc.nextInt();

        for(int i=num1; i<=num2; i++){
            if(i%2==0){
                System.out.println(i);
            }
        }

    }
}