import java.util.Scanner;


class p3{
    public static void main(String args[]){
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter the num");
        int num = SC.nextInt();

        for(int i=1; i<=num; i++){
            if(i%2==0){
                System.out.println("Cube of "+i+" : "+i*i*i+" & Square of "+i+" : "+i*i);
            }
        }
    }
}