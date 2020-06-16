import java.util.Scanner;

public class reverse_integer {
    public static void main(String[] args) {
                // find reverse integer
        int num =0;
        int reversnum = 0;
        System.out.println("input your number and press enter");
        Scanner  in = new Scanner(System.in);
        num=in.nextInt();
        while(num!=0){                           //  use while loop
            reversnum = reversnum * 10;
            reversnum = reversnum + num%10;
            num =num/10;




        }
        System.out.println("reverse of input number is"+reversnum);


















    }






}
