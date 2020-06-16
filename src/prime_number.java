import java.util.Scanner;

public class prime_number {
                // find number is is prime or not
    public static void main(String[] args) {
        int num =0;
        int prime = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter number");
        num = sc.nextInt();
        if(num%2==0&&num>=2){
            prime =0;

        }
        else {

            prime =1;

        }
        if(prime ==0){
            System.out.println("this number is prime");
        }
        else{
            System.out.println("this number is not prime");

        }








    }





















}


