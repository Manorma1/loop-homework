import java.util.Scanner;

public class sum_first_last_number {

    public static void main(String[] args) {
         // sum of first and last number
        Scanner sc =new Scanner(System.in);
        System.out.println("please enter the number");
        int number = sc.nextInt();
        int lastDigit = number%10;
        int firstDigit = number;
        while(firstDigit>=10){             // use while loop

            firstDigit= firstDigit/10;
        }
        System.out.println("first digit = "+firstDigit);
        System.out.println("last digit = "+lastDigit);
        System.out.println("sum="+(firstDigit+lastDigit));












    }























}








