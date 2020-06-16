import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Scanner;

public class sum_Odd_Even {


    public static void main(String[] args) {
                 // to check sum of even number and odd number
               int evennum = 0,
                       oddnum = 0;

               int evensum =0;
                  int oddsum = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter  int1,int2,int3,int4,int5");
        int n = scanner.nextInt();
        while (n>0){                       // use while loop


            int rem = n%10;
            if(rem%2==0){
    evensum= evensum + rem;
                evennum++;
                n=n/10;
            }
                else{
                    oddsum =oddsum+rem;
                    oddnum++;
                n=n/10;}

        }
        System.out.println("even count" +evennum);
        System.out.println("total of even digits"+evensum); // sum of even number

        System.out.println ("odd cont" + oddnum);
        System.out.println("total of odd digits"+oddsum);         // sum of odd number







        }








        }






























