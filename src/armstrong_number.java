import java.util.Scanner;

public class armstrong_number {


    public static void main(String[] args) {
            // find number is armstrong or not;
        int n, count = 0,a,b,c, sum =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter number ");
        n=sc.nextInt();
        a=n;
        c=n;
        while(a>0){                        // use while loop
            a=a/10;
            count++;

        }
        while(n>0){

            b=n%10;
            sum = (int) (sum +Math.pow(b, count));
            n=n/10;

        }
        if(sum ==c){
            System.out.println("the number is armstrong");
        }
        else{


            System.out.println("the number is not armstrong" );
        }

















    }















}
