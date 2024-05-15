package JavaCodingInterview;

import java.util.Scanner;

public class PalindromeString {

    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: ");

        String str=sc.next();
        //have another variable, original string
        String org=str;
        int len=org.length();

        String rev="";

        //for loop
        for(int x=len - 1;x>=0;x--){
            rev=rev + str.charAt(x);
        }

        System.out.println("reversed string: "+ rev);

        if(org.equals(rev)){
            System.out.println(org+ " string is palindrome");
        }else{
            System.out.println(org+ "string is not palindrome");
        }


    }
}
