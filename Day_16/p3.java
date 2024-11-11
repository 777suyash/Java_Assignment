
import java.util.Scanner;

class p3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("current : ");
        double i = sc.nextDouble();
        System.out.println("resistance : ");
        double r = sc.nextDouble();

        if(i>=0 & r>=0){
            System.out.println("voltege V : "+i*r);
        }
        else{
            System.out.println("invalid ");
        }
    }
}