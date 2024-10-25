
import java.util.Scanner;

class p3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr the Distance (d)");
        double Distance = sc.nextDouble();
        System.out.println("Enter the Time (t)");
        double Time = sc.nextDouble();
        
        System.out.println(" The Velocity of a Particle roaming In space is "+(Distance/Time)+" m/s");
    }
}