import java.util.Scanner;

public class sum {

    public static void main(String[] args) {
              // sum

           int x,y;
         int sum=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter five number ");
        x=scanner.nextInt();
        while (x>0){                  // using while loop

            y=x%10;
            sum=sum+y;
            x=x/10;



        }
        System.out.println("sum of digits ="+sum);






















    }























}
