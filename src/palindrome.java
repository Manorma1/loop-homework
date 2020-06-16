import java.util.Scanner;

public class palindrome {


    public static void main(String args[])
    {                 //  find number is palindrome or not
        Scanner in = new Scanner(System.in);
        System.out.print(" please Input a number: ");
        int n = in.nextInt();
        int sum = 0, r;
        int temp = n;
        while(n>0)                       // use while loop
        {
            r = n % 10;
            sum = (sum*10)+r;
            n = n/10;
        }
        if(temp==sum)                                 // use if else
            System.out.println("It is a Palindrome number.");
        else
            System.out.println("Not a palindrome");
    }









}
