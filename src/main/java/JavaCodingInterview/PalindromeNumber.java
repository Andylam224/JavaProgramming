package JavaCodingInterview;

import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a number");

        int num=sc.nextInt();

        int org_num=num;

        int rev=0;

        while (num!=0){
            rev=rev * 10 + num%10;
            num=num/10;
        }
        System.out.println(rev);

        //compare the reverse to the original number
        //write a if condition
        if(org_num==rev){
            System.out.println(org_num+" Number is palindrome");
        }else{
            System.out.println(org_num+" Not palindrome number");
        }


    }
}
