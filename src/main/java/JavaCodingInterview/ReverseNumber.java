package JavaCodingInterview;

import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a number");

        int num=sc.nextInt();  //1234 _> 4321

        //using algorithm

        int rev=0;

        //simple logic
         while(num!=0)
         {

             //add the last digit to rev
         rev=rev * 10 + num % 10; //modulus  //0 *10 + 1234%10
             //1234%10 =will give you 4

             //removes the last digit from num
         num=num/10;
         }
        System.out.println("reverse Number is : "+ rev);
    }
}
