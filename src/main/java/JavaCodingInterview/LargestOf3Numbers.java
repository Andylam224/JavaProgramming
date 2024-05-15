package JavaCodingInterview;

import java.util.Scanner;

public class LargestOf3Numbers {

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter first number");
        int a=sc.nextInt();

        System.out.println("Enter second number");
        int b=sc.nextInt();

        System.out.println("Enter third number");
        int c=sc.nextInt();

        //approach 1 - logic

        if(a>b && a>c){
            System.out.println(a+" is Largest number");

        }else if(b>a && b>c){
            System.out.println(b + " is largest number");
        }else{
            System.out.println(c +" is Largest number");
        }


        //ternary
        /*
        a=10 b=20
        largest=a>b? a:b
         */
        //boolean ex ? true:false;

      int largest1=  a>b? a:b; //largest of a & b
      int largest2= c>largest1? c:largest1;  //largest of c & largest1
        System.out.println(largest2 + "is Largest number");
    }
}
