package Day2;

public class VariablesDemo {

    public static void main(String[] args) {
        //creating variables
        //variable - is a container which can hold data to represent data we need variables.
        int a;  //declaration, haven't assigned any data
        a = 100; //assignment


        int b = 100;   //declaration + assignment
        System.out.println(b);

        a = 200;
        System.out.println(a);

        //approach 1
//        int c=100;
//        int d=200;
//        int e=300;

        //approach 2

        int f, g, h;
        f = 100;
        g = 200;
        h = 300;

        //approach 3
        int c = 100, d = 200, e = 300;

        System.out.println("the value of a is " + a);
        System.out.println("the value of b is " + b);
        System.out.println("the value of c is " + c);

        System.out.println(a + " " + b + " " + c);


    }
}
