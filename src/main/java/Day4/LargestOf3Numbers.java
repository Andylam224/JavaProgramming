package Day4;

public class LargestOf3Numbers {


    public static void main(String[] args) {

        //initialize 3 numbers
        int a = 10;
        int b = 20;
        int c = 30;


        //using logical operator and create 3 conditional statements

        if (a > b && a > c) {
            System.out.println("a is largest number");
        } else if (b > a && b > c) {
            System.out.println("b is largest number");
        } else if (c > a && c > b) {
            System.out.println("c is the larger number");
        }


    }
}
