package JavaCodingInterview;

public class Swapping2Numbers {

    public static void main(String [] args){

        int a=10, b=20;

        System.out.println("Before swapping values are "+a+" "+b);

        //first logic - use a third variable

        int t=a;
        a=b;
        b=t;


        //logic 2 (another approach) using + & - (without using third variable)

        a=a+b;   //10+20=30
        b=a-b;  //30 -20=10
        a=a-b;  //30-10=20


        //logic 3 using * and / without using third variable
        //here a & b should not be zero
        a=a * b;  //10 * 20 =200
        b= a/b; //200/20=10
        a=a/b;  //200/10=20

        //logic 4 - bitwise XOR (^)

        a=a^b;  //convert number to binary format
        b=a^b;
        a=a^b;


        //logic 5 Single statement
        //a=10 b=20
        //right to left
        b=a+b -(a=b);


        System.out.println("After swapping values are.."+a+" "+b);






    }
}
